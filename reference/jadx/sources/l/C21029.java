package l;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21029 implements InterfaceC21100, InterfaceC17544, InterfaceC11572 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67201;

    public /* synthetic */ C21029(Object obj) {
        this.f67201 = obj;
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((C11003) this.f67201).m45194(i);
    }

    @Override // l.InterfaceC11572
    public List accept(Object obj) {
        HashSet hashSet = (HashSet) this.f67201;
        C22737 c22737Mo10207 = ((InterfaceC14906) obj).mo10207();
        if (c22737Mo10207 != null && hashSet.contains(c22737Mo10207.getType())) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        return C8275.m22342(new C9020((AbstractC22044) this.f67201));
    }
}
