package l;

/* JADX INFO: renamed from: l.᩶ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBAF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21034 extends AbstractC5875 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f67224;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20791 f67225;

    public C21034(C20791 c20791) {
        super("BootstrapMethods");
        this.f67225 = c20791;
        int size = (c20791.size() * 4) + 8;
        for (int i = 0; i < c20791.size(); i++) {
            size += c20791.get(i).m11783().size() * 2;
        }
        this.f67224 = size;
    }

    @Override // l.InterfaceC1159
    /* JADX INFO: renamed from: ۙ */
    public final int mo1345() {
        return this.f67224;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20791 m48073() {
        return this.f67225;
    }
}
