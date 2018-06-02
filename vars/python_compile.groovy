def call(String directory = '.')
{
	sh """find ${directory} -name *.py -print0|xargs -0 -L 1 python -m py_compile"""
}