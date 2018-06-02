def call()
{
	sh """find . -name *.py -print0|xargs -0 -L 1 python -m python_compile)"""
}