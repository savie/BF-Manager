package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۖ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7QW */
/* JADX INFO: loaded from: classes3.dex */
public class C2977 extends C1486 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char[] f9670;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f9671;

    public C2977(Writer writer, char[] cArr) {
        super(writer);
        this.f9670 = cArr;
    }

    @Override // l.C1486
    /* JADX INFO: renamed from: ᩷ */
    public void mo5305() throws IOException {
        this.f9671++;
        this.f5182.write(91);
        m9695();
    }

    @Override // l.C1486
    /* JADX INFO: renamed from: ۙ */
    public void mo5297() throws IOException {
        this.f9671--;
        m9695();
        this.f5182.write(93);
    }

    @Override // l.C1486
    /* JADX INFO: renamed from: ۤ */
    public void mo5299() throws IOException {
        this.f5182.write(44);
        if (m9695()) {
            return;
        }
        this.f5182.write(32);
    }

    @Override // l.C1486
    /* JADX INFO: renamed from: ܳ */
    public void mo5302() throws IOException {
        this.f9671++;
        this.f5182.write(123);
        m9695();
    }

    @Override // l.C1486
    /* JADX INFO: renamed from: ᩴ */
    public void mo5303() throws IOException {
        this.f9671--;
        m9695();
        this.f5182.write(q.h);
    }

    @Override // l.C1486
    /* JADX INFO: renamed from: ᩸ */
    public void mo5307() throws IOException {
        this.f5182.write(58);
        this.f5182.write(32);
    }

    @Override // l.C1486
    /* JADX INFO: renamed from: ۫ */
    public void mo5301() throws IOException {
        this.f5182.write(44);
        if (m9695()) {
            return;
        }
        this.f5182.write(32);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m9695() throws IOException {
        if (this.f9670 == null) {
            return false;
        }
        this.f5182.write(10);
        for (int i = 0; i < this.f9671; i++) {
            this.f5182.write(this.f9670);
        }
        return true;
    }
}
