package br.pic.populate;

public interface PicPopulate <T, M>{
	public T toModel(M data);
}
