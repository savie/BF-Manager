package l;

/* JADX INFO: renamed from: l.᩵ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J1DS */
/* JADX INFO: loaded from: classes5.dex */
public class C20709 implements InterfaceC5969 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char f66377;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f66378;

    public C20709(char c, Object obj) {
        this.f66377 = c;
        this.f66378 = obj;
    }

    @Override // l.InterfaceC5969
    /* JADX INFO: renamed from: ᩴ */
    public final char mo14179() {
        return this.f66377;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f66378;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return Character.valueOf(mo14179());
    }
}
