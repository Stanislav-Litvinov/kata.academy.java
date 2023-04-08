package academy.kata.lesson6;

// 2.5.7 Практическое задание

import java.util.Arrays;

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK;
}

interface TextAnalyzer {
    Label processText(String text);
}

class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    TooLongTextAnalyzer(int textLength) {
        this.maxLength = textLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        } else {
            return Label.OK;
        }
    }

    class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
        private final String[] KEYWORDS = {":(", "=(", ":|"};

        @Override
        protected String[] getKeywords() {
            return KEYWORDS;
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
        private final String[] keywords;

        public SpamAnalyzer(String[] keywords) {
            this.keywords = Arrays.copyOf(keywords, keywords.length);
        }

        @Override
        protected String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }

    abstract class KeywordAnalyzer implements TextAnalyzer {
        protected abstract String[] getKeywords();

        protected abstract Label getLabel();

        public Label processText(String text) {
            for (String keyword : getKeywords()) {
                if (text.contains(keyword)) {
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }
}


public class Filter {
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label label = analyzer.processText(text);
            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }
}