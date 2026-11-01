package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۨ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X7QW */
/* JADX INFO: loaded from: classes4.dex */
public class C11380 extends C4323 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final char[] f38369;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f38370;

    public C11380(Writer writer, char[] cArr) {
        super(writer);
        this.f38369 = cArr;
    }

    @Override // l.C4323
    /* JADX INFO: renamed from: ܰ */
    public void mo12158() throws IOException {
        this.f38370++;
        this.f15521.write(91);
        m28480();
    }

    @Override // l.C4323
    /* JADX INFO: renamed from: ۙ */
    public void mo12152() throws IOException {
        this.f38370--;
        m28480();
        this.f15521.write(93);
    }

    @Override // l.C4323
    /* JADX INFO: renamed from: ۨ */
    public void mo12156() throws IOException {
        this.f15521.write(44);
        if (m28480()) {
            return;
        }
        this.f15521.write(32);
    }

    @Override // l.C4323
    /* JADX INFO: renamed from: ᩹ */
    public void mo12160() throws IOException {
        this.f38370++;
        this.f15521.write(123);
        m28480();
    }

    @Override // l.C4323
    /* JADX INFO: renamed from: ۚ */
    public void mo12154() throws IOException {
        this.f38370--;
        m28480();
        this.f15521.write(q.h);
    }

    @Override // l.C4323
    /* JADX INFO: renamed from: ۖ */
    public void mo12150() throws IOException {
        this.f15521.write(58);
        this.f15521.write(32);
    }

    @Override // l.C4323
    /* JADX INFO: renamed from: ֨ */
    public void mo12149() throws IOException {
        this.f15521.write(44);
        if (m28480()) {
            return;
        }
        this.f15521.write(32);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m28480() throws IOException {
        if (this.f38369 == null) {
            return false;
        }
        this.f15521.write(10);
        for (int i = 0; i < this.f38370; i++) {
            this.f15521.write(this.f38369);
        }
        return true;
    }
}
