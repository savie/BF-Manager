package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9CF */
/* JADX INFO: loaded from: classes2.dex */
public final class C3586 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f13193;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19110 f13194;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f13195;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f13196;

    public C3586(String str, String str2, C19110 c19110, Object... objArr) {
        this.f13193 = str;
        this.f13195 = str2;
        this.f13194 = c19110;
        this.f13196 = objArr;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m10601() {
        return this.f13193;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m10598() {
        return this.f13195;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19110 m10600() {
        return this.f13194;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m10603() {
        return this.f13196.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m10599(int i) {
        return this.f13196[i];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object[] m10602() {
        return this.f13196;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3586)) {
            return false;
        }
        C3586 c3586 = (C3586) obj;
        return this.f13193.equals(c3586.f13193) && this.f13195.equals(c3586.f13195) && this.f13194.equals(c3586.f13194) && Arrays.equals(this.f13196, c3586.f13196);
    }

    public final int hashCode() {
        return ((this.f13193.hashCode() ^ Integer.rotateLeft(this.f13195.hashCode(), 8)) ^ Integer.rotateLeft(this.f13194.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f13196), 24);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13194);
        String string = Arrays.toString(this.f13196);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13193);
        sb.append(" : ");
        sb.append(this.f13195);
        sb.append(" ");
        sb.append(strValueOf);
        return C22697.m50267(sb, " ", string);
    }
}
