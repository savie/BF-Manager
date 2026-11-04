package l;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.search.SearchView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ܽۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 498X */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17340 implements InterfaceC17544, ISequentialOutStream, InterfaceC25265, InterfaceC12119, InterfaceC20581, InterfaceC22491 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56446;

    public /* synthetic */ C17340(Object obj) {
        this.f56446 = obj;
    }

    @Override // l.InterfaceC22491
    public C3977 onApplyWindowInsets(View view, C3977 c3977) {
        return ((SearchView) this.f56446).lambda$setUpStatusBarSpacerInsetListener$5(view, c3977);
    }

    @Override // l.InterfaceC20581
    public boolean perform(View view, AbstractC1936 abstractC1936) {
        return ((BottomSheetDragHandleView) this.f56446).lambda$onBottomSheetStateChanged$0(view, abstractC1936);
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((C12997) this.f56446).mo16839(i);
    }

    @Override // l.InterfaceC25265
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo40719(long j, long j2) {
        C13132.m32642((C13132) this.f56446, j, j2);
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        if (((InterfaceC2742) this.f56446).mo924()) {
            throw new SevenZipException("Canceled");
        }
        return byteBuffer.remaining();
    }

    @Override // l.InterfaceC12119
    /* JADX INFO: renamed from: ᩷ */
    public byte mo30288(int i) {
        ArrayList arrayList = (ArrayList) this.f56446;
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5408 c5408 = (C5408) arrayList.get(i2);
            int iM16131 = c5408.m16131() - 1;
            if (i < iM16131) {
                return c5408.m16117(i + 1);
            }
            i -= iM16131;
        }
        throw new IndexOutOfBoundsException();
    }
}
