package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes3.dex */
public final class C8937 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29170;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14903 f29172;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f29176;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f29177;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10671 f29178;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f29175 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f29174 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f29169 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f29171 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f29173 = -1;

    public C8937(C10671 c10671) {
        this.f29178 = c10671;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23903(C23131 c23131) {
        this.f29175.add(c23131);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23900(String str) {
        ArrayList arrayList = this.f29174;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23901(String str, C10186 c10186) {
        this.f29169.add(str);
        this.f29171.add(new C15671(str, c10186.f32601, c10186.getMessage()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23904() {
        return this.f29175.size() >= this.f29178.f33861;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23902(C14903 c14903) {
        this.f29172 = c14903;
    }
}
