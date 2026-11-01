package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩻᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes.dex */
public class C23928 extends WeakReference implements InterfaceC0769 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC12639 f77504;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f77505;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC0769 f77506;

    public C23928(int i, InterfaceC0769 interfaceC0769, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.f77504 = ConcurrentMapC21937.f71143;
        this.f77505 = i;
        this.f77506 = interfaceC0769;
    }

    @Override // l.InterfaceC0769
    public final Object getKey() {
        return get();
    }

    /* JADX INFO: renamed from: ᩺ */
    public long mo3306() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo3301(long j) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֨ */
    public InterfaceC0769 mo3299() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo3305(InterfaceC0769 interfaceC0769) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC0769 mo3300() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo3302(InterfaceC0769 interfaceC0769) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۜ */
    public long mo2936() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo2937(long j) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC0769 mo2939() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo2938(InterfaceC0769 interfaceC0769) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۘ */
    public InterfaceC0769 mo2935() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo2934(InterfaceC0769 interfaceC0769) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC0769
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC12639 mo3304() {
        return this.f77504;
    }

    @Override // l.InterfaceC0769
    /* JADX INFO: renamed from: ۙ */
    public final void mo3303(InterfaceC12639 interfaceC12639) {
        this.f77504 = interfaceC12639;
    }

    @Override // l.InterfaceC0769
    public final int getHash() {
        return this.f77505;
    }

    @Override // l.InterfaceC0769
    public final InterfaceC0769 getNext() {
        return this.f77506;
    }
}
