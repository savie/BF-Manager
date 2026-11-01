package l;

/* JADX INFO: renamed from: l.ۚۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1DS */
/* JADX INFO: loaded from: classes3.dex */
public class C5273 implements InterfaceC14260 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char f18265;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f18266;

    public C5273(char c, Object obj) {
        this.f18265 = c;
        this.f18266 = obj;
    }

    @Override // l.InterfaceC14260
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final char mo14566() {
        return this.f18265;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18266;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return Character.valueOf(mo14566());
    }
}
