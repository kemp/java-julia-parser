package me.javajuliaprocessor;

class LexicalAnalyzer {

    /**
     * Analyzes a given line for tokens.
     *
     * @param input the line to analyze
     * @return A list of tokens
     * @throws UnknownTokenException A token invalid to the analyzer
     */
    TokenList analyzeLine(String input) throws UnknownTokenException {
        TokenList tokens = new TokenList();

        // Good ol' pass-by-reference allows the TokenList to be filled
        // without it having to be returned.
        analyzeLine(input, tokens);

        return tokens;
    }

    /**
     * Recursive method that analyzes the input and calls itself with the next section of input
     * @param input string input
     * @param tokens carried-over list of tokens
     */
    private void analyzeLine(String input, TokenList tokens) throws UnknownTokenException {
        // Remove whitespace from the input (front and back)
        input = input.trim();

        // Ignores empty lines and lines starting with "#" (comments)
        if (input.length() > 0 && !input.startsWith("#")) {
            // Get the next token...
            Token token = Token.fromString(input);

            // Add the token to the list.
            tokens.add(token);

            // Analyze the remaining part of the line (subtracting from the front
            // the length of the lexeme that has just been read.)
            analyzeLine(input.substring(token.getLexeme().length()), tokens);
        }
    }

}
