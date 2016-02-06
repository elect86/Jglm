/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2;

import dev.*;
import dev.Vec3;
import dev.Vec4;

/**
 *
 * @author GBarbieri
 */
public class Vec2 extends operator {

    public Vec2() {
        x = 0f;
        y = 0f;
    }

    public Vec2(float f) {
        x = f;
        y = f;
    }

    public Vec2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vec2(double f) {
        x = (float) f;
        y = (float) f;
    }

    public Vec2(double x, double y) {
        this.x = (float) x;
        this.y = (float) y;
    }

    public Vec2(Vec2 v) {
        x = v.x;
        y = v.y;
    }

    public Vec2(Vec3 v) {
        x = v.x;
        y = v.y;
    }

    public Vec2(Vec4 v) {
        x = v.x;
        y = v.y;
    }

    /**
     * Return the length of this vector.
     *
     * @return the length
     */
    public float length() {
        return (float) Math.sqrt((x * x) + (y * y));
    }

    /**
     * Normalize this vector.
     *
     * @return this
     */
    public Vec2 normalize() {
        return normalize(this);
    }

    /**
     * Normalize this vector and store the result in <code>dest</code>.
     *
     * @param dest
     * will hold the result
     * @return dest
     */
    public Vec2 normalize(Vec2 dest) {
        float invLength = (float) (1.0 / Math.sqrt(x * x + y * y));
        dest.x = x * invLength;
        dest.y = y * invLength;
        return dest;
    }

}