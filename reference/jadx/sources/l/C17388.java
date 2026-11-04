package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ܽۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A641 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17388 implements Serializable {
    public static final long serialVersionUID = 9010790363003271996L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f56546;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f56547;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean[][] f56548;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f56549;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f56550;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Calendar f56551;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f56552;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f56553;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f56554;

    public C17388() {
        this.f56547 = 3;
        this.f56550 = -1L;
        this.f56549 = "";
        this.f56554 = "";
        this.f56548 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 3, 3);
    }

    public C17388(String str) {
        this.f56547 = 3;
        this.f56550 = -1L;
        this.f56549 = "";
        this.f56554 = "";
        this.f56548 = null;
        this.f56553 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m40826() {
        return this.f56554;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m40841() {
        return this.f56552;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m40834() {
        return this.f56546;
    }

    public final String toString() {
        return this.f56553;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m40843() {
        return this.f56553;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m40839() {
        return this.f56550;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Calendar m40838() {
        return this.f56551;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m40837() {
        return this.f56547;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m40833() {
        return this.f56549;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40832(int i, int i2) {
        boolean[][] zArr = this.f56548;
        if (zArr == null) {
            return false;
        }
        return zArr[i][i2];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40825() {
        return this.f56547 == 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m40836() {
        return this.f56547 == 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m40845() {
        return this.f56547 == 2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40830(String str) {
        this.f56554 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40842(String str) {
        this.f56552 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m40835(String str) {
        this.f56546 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40828(int i, int i2, boolean z) {
        this.f56548[i][i2] = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m40844(String str) {
        this.f56553 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40829(long j) {
        this.f56550 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40831(Calendar calendar) {
        this.f56551 = calendar;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40827(int i) {
        this.f56547 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m40840(String str) {
        this.f56549 = str;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
