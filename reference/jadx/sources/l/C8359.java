package l;

/* JADX INFO: renamed from: l.۠ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06KD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8359 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f27425;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6868 f27426;

    public C8359(C6868 c6868) {
        this.f27426 = c6868;
        this.f27425 = c6868.m19124();
        c6868.m19126("writing_source_checkpoint");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f27426.m19126(this.f27425);
    }
}
