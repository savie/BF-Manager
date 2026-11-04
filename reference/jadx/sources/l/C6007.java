package l;

import com.umeng.commonsdk.listener.OnGetOaidListener;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.function.Consumer;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۚ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BMC */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6007 implements InterfaceC19795, InterfaceC5392, ISequentialOutStream, OnGetOaidListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20558;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20559;

    public /* synthetic */ C6007(int i, Object obj) {
        this.f20558 = i;
        this.f20559 = obj;
    }

    public /* synthetic */ C6007(C11041 c11041, Object obj, long j) {
        this.f20558 = 2;
        this.f20559 = obj;
    }

    @Override // com.umeng.commonsdk.listener.OnGetOaidListener
    public void onGetOaid(String str) {
        ((Consumer) this.f20559).n(str);
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        switch (this.f20558) {
            case 1:
                ((InterfaceC10582) obj).mo7233((C18787) this.f20559);
                break;
            default:
                ((InterfaceC19992) obj).getClass();
                break;
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        try {
            return ((InterfaceC11573) this.f20559).write(byteBuffer);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        new DialogInterfaceOnClickListenerC14300((C8614) this.f20559, abstractC22044.mo4294());
    }
}
