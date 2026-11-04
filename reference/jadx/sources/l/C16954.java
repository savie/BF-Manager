package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5IV1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16954 implements InterfaceC1213 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f55386;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6514 f55387;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f55388;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f55389;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f55390;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f55391;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15580 f55392;

    public C16954(C6514 c6514) {
        this.f55387 = c6514;
    }

    @Override // l.InterfaceC1213
    /* JADX INFO: renamed from: ᩸ */
    public final String mo4434() {
        return this.f55389;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39935(String str) {
        this.f55389 = str;
    }

    @Override // l.InterfaceC1213
    public final String getType() {
        return this.f55388;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39933(String str) {
        this.f55388 = str;
    }

    @Override // l.InterfaceC1213
    public final String getName() {
        return this.f55390;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39931(String str) {
        this.f55390 = str;
    }

    @Override // l.InterfaceC1213
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4433() {
        return this.f55386;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39930(int i) {
        this.f55386 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39934(int i) {
        this.f55391 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39932(C15580 c15580) {
        this.f55392 = c15580;
    }

    @Override // l.InterfaceC1213
    public final ArrayList getAttributes() {
        ArrayList arrayList = new ArrayList(2);
        C15580 c15580 = this.f55392;
        if (c15580 != null) {
            arrayList.add(c15580);
        }
        C6514 c6514 = this.f55387;
        if (c6514 == null) {
            throw new NullPointerException("Annotation parser not initialized");
        }
        C2039.m7011(arrayList, c6514.m18379(this.f55391));
        return arrayList;
    }

    public final String toString() {
        return this.f55389 + "->" + this.f55390 + ":" + this.f55388;
    }
}
