package chapter4;

// 증인 역할
public interface Witness {
    boolean enter();  // 증인석에 입장하는 행동
    Statement testify();  // 증언하는 행동
}