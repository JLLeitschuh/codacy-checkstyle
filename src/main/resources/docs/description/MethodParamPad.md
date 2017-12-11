Since Checkstyle 3.4

Checks the padding between the identifier of a method definition, constructor definition, method call, or constructor invocation; and the left parenthesis of the parameter list. That is, if the identifier and left parenthesis are on the same line, checks whether a space is required immediately after the identifier or such a space is forbidden. If they are not on the same line, reports an error, unless configured to allow line breaks. To allow linebreaks after the identifier, set property `allowLineBreaks` to `true`.