package types;

import javaslang.collection.Tree;

/**
 * Created by aluno on 20/03/2017.
 */
public class NAME extends Type{
    public String name;
    public Type binding;

    public NAME(String name) {
        this.name = name;
    }

    @Override
    public Type actual() {
        return binding.actual();
    }

    @Override
    public Tree.Node<String> toTree() {
        return Tree.of("NAME: " + name);
    }

    @Override
    public boolean is(Type type) {
        return binding.is(type);
    }
}
