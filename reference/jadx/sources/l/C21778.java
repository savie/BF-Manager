package l;

import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plugin.api.ui.PluginProgressBar;
import bin.mt.plugin.api.util.Consumer;
import bin.mt.plus.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩸᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21778 implements InterfaceC7359, InterfaceC1008, InterfaceC22091, InterfaceC18848, ISequentialOutStream, InterfaceC4509, Consumer, InterfaceC13320 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70552;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70553;

    public /* synthetic */ C21778(int i, Object obj) {
        this.f70552 = i;
        this.f70553 = obj;
    }

    public /* synthetic */ C21778(C19602 c19602, Object obj, long j) {
        this.f70552 = 1;
        this.f70553 = obj;
    }

    @Override // l.InterfaceC1008
    public void accept(Object obj) {
        switch (this.f70552) {
            case 2:
                C11891.m29649((C11891) this.f70553, (C17513) obj);
                break;
            default:
                ((PluginProgressBar) this.f70553).setProgress(((Integer) obj).intValue());
                break;
        }
    }

    @Override // l.InterfaceC4509
    /* JADX INFO: renamed from: ۙ */
    public void mo4354(TextView textView) {
        C13913 c13913 = (C13913) this.f70553;
        c13913.f45828.m49143(R.string.MT_Protector, new C16081(c13913, textView));
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public void mo1179(AbstractC23903 abstractC23903) {
        ((C12325) this.f70553).m30618((C19670) abstractC23903);
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public /* synthetic */ boolean mo1180() {
        return false;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        InterfaceC12086 interfaceC12086 = (InterfaceC12086) this.f70553;
        try {
            int iRemaining = byteBuffer.remaining();
            interfaceC12086.mo30076(byteBuffer);
            return iRemaining;
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // l.InterfaceC22091
    /* JADX INFO: renamed from: ۙ */
    public void mo21236(boolean z) {
        ProgressBar progressBar = (ProgressBar) this.f70553;
        int i = AbstractActivityC10490.f35934;
        progressBar.setVisibility(z ? 0 : 8);
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(AbstractC20745 abstractC20745) {
        C8265.m21682((C11545) this.f70553, abstractC20745);
    }
}
