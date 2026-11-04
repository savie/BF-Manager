package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۠ۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public class C8573 extends WeakReference implements InterfaceC2213 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f27985;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC10064 f27986;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC2213 f27987;

    public C8573(int i, InterfaceC2213 interfaceC2213, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.f27986 = ConcurrentMapC5942.f20334;
        this.f27985 = i;
        this.f27987 = interfaceC2213;
    }

    @Override // l.InterfaceC2213
    public final Object getKey() {
        return get();
    }

    /* JADX INFO: renamed from: ᩻ */
    public long mo7556() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo7545(long j) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۫ */
    public InterfaceC2213 mo7551() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo7553(InterfaceC2213 interfaceC2213) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC2213 mo7544() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo7546(InterfaceC2213 interfaceC2213) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۧ */
    public long mo7550() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo7548(long j) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC2213 mo7554() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo7549(InterfaceC2213 interfaceC2213) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC2213 mo7543() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo7555(InterfaceC2213 interfaceC2213) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC2213
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC10064 mo7552() {
        return this.f27986;
    }

    @Override // l.InterfaceC2213
    /* JADX INFO: renamed from: ۙ */
    public final void mo7547(InterfaceC10064 interfaceC10064) {
        this.f27986 = interfaceC10064;
    }

    @Override // l.InterfaceC2213
    public final int getHash() {
        return this.f27985;
    }

    @Override // l.InterfaceC2213
    public final InterfaceC2213 getNext() {
        return this.f27987;
    }
}
