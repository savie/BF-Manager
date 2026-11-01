package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ۧܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A641 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11086 implements Serializable {
    public static final long serialVersionUID = 9010790363003271996L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f37628;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f37629;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f37630;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean[][] f37631;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Calendar f37632;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f37633;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f37634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f37635;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f37636;

    public C11086() {
        this.f37630 = 3;
        this.f37629 = -1L;
        this.f37636 = "";
        this.f37635 = "";
        this.f37631 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 3, 3);
    }

    public C11086(String str) {
        this.f37630 = 3;
        this.f37629 = -1L;
        this.f37636 = "";
        this.f37635 = "";
        this.f37631 = null;
        this.f37634 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27946() {
        return this.f37635;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m27959() {
        return this.f37628;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m27956() {
        return this.f37633;
    }

    public final String toString() {
        return this.f37634;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m27943() {
        return this.f37634;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m27953() {
        return this.f37629;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Calendar m27961() {
        return this.f37632;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m27942() {
        return this.f37630;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m27958() {
        return this.f37636;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27952(int i, int i2) {
        boolean[][] zArr = this.f37631;
        if (zArr == null) {
            return false;
        }
        return zArr[i][i2];
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m27945() {
        return this.f37630 == 1;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m27955() {
        return this.f37630 == 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m27962() {
        return this.f37630 == 2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27950(String str) {
        this.f37635 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27960(String str) {
        this.f37628 = str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m27957(String str) {
        this.f37633 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27948(int i, int i2, boolean z) {
        this.f37631[i][i2] = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m27944(String str) {
        this.f37634 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27949(long j) {
        this.f37629 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27951(Calendar calendar) {
        this.f37632 = calendar;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27947(int i) {
        this.f37630 = i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m27954(String str) {
        this.f37636 = str;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
