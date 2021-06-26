# Syndrome
 
INSTRUCTION - The smallest unit JaCoCo counts are single Java byte code instructions. Instruction coverage provides information about the amount of code that has been executed or missed. This metric is completely independent from source formatting and always available, even in absence of debug information in the class files.

LINE - For all class files that have been compiled with debug information, coverage information for individual lines can be calculated. A source line is considered executed when at least one instruction that is assigned to this line has been executed.

BRANCH - JaCoCo also calculates branch coverage for all if and switch statements. This metric counts the total number of such branches in a method and determines the number of executed or missed branches. Branch coverage is always available, even in absence of debug information in the class files. Note that exception handling is not considered as branches in the context of this counter definition.
