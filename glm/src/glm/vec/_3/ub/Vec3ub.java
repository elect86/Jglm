/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.ub;

/**
 *
 * @author elect
 */
public class Vec3ub {
    
    public static final int SIZE = 3 * Byte.BYTES;

    public byte x, y, z;

    public Vec3ub set(int x, int y, int z) {
        return set((byte) x, (byte) y, (byte) z);
    }
    
    public Vec3ub set(byte x, byte y, byte z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }
}