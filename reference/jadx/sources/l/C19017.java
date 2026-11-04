package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OIY9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19017 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 f61616;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f61617;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f61618;

    public C19017(C21943 c21943, int i, int i2) {
        this.f61617 = i;
        this.f61616 = c21943;
        this.f61618 = i2;
    }

    public final String toString() {
        return m44104();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m44104() {
        StringBuilder sb = new StringBuilder("BlockInsnInfo - ");
        sb.append(this.f61616.toString());
        sb.append(" [↑ ");
        return C12669.m31437(this.f61617, "] [↓ 0] ", sb);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19017 m44101() {
        return new C19017(this.f61616, this.f61617, this.f61618);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21943 m44106() {
        return this.f61616;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m44108() {
        return this.f61617;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44107(int i) {
        this.f61617 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m44103() {
        return this.f61618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44102(int i) {
        this.f61618 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m44105() {
        C21943 c21943 = this.f61616;
        List listMo1986 = c21943.mo1986();
        int i = this.f61617;
        ArrayList arrayList = (ArrayList) listMo1986;
        if (i > arrayList.size()) {
            throw new IndexOutOfBoundsException("Attempted to get instructions slice of block " + c21943.toString() + " with " + i + " skipped instructions whilst only having " + arrayList.size() + " instructions in block.");
        }
        return arrayList.subList(0, arrayList.size() - this.f61617);
    }
}
