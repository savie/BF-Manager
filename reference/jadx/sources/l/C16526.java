package l;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ܽ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes5.dex */
public final class C16526 implements InterfaceC9868 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f53091;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21920 f53092;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10197 f53093;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f53094;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f53095;

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ֨ۙ */
    public final /* synthetic */ boolean mo10347() {
        return true;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo11188() {
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܰۙ */
    public final /* synthetic */ void mo11191() {
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩹ */
    public final ISequentialOutStream mo11194() {
        return null;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ void mo11195(int i) {
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܺ */
    public final String mo11192() {
        return C11088.m27967(mo11189());
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۙ */
    public final void mo11187(String str) {
        C11088.m27975(mo11189(), str);
    }

    public C16526(C21920 c21920, List list, AtomicReference atomicReference, C10197 c10197, AtomicInteger atomicInteger) {
        this.f53092 = c21920;
        this.f53091 = list;
        this.f53095 = atomicReference;
        this.f53093 = c10197;
        this.f53094 = atomicInteger;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۬ */
    public final String mo11189() {
        return this.f53092.m48739();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۖۙ */
    public final IInArchive mo11185() {
        return this.f53092.m48745();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܰ */
    public final void mo11190(IInArchive iInArchive) {
        this.f53092.m48740(iInArchive);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۘ */
    public final void mo11186(int i) {
        AtomicReference atomicReference = this.f53095;
        if (i >= 0) {
            List list = this.f53091;
            if (i < list.size()) {
                atomicReference.set(((C18334) list.get(i)).m42573());
                return;
            }
        }
        atomicReference.set(null);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10350(int i) {
        if (i < 0) {
            return false;
        }
        List list = this.f53091;
        return i < list.size() && ((C18334) list.get(i)).m42581();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩶ */
    public final void mo11193() {
        this.f53095.set(null);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۨ */
    public final void mo10349() {
        this.f53093.cancel();
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f53093.m25972();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۙ */
    public final void mo10348(int i) {
        this.f53094.set(i);
    }
}
