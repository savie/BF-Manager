package l;

import android.widget.Button;
import android.widget.TextView;
import java.io.BufferedOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4328 implements InterfaceC4509, InterfaceC5215, InterfaceC7034, InterfaceC3485, InterfaceC21921, InterfaceC13320 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15523;

    public /* synthetic */ C4328(Object obj) {
        this.f15523 = obj;
    }

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo2748() {
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        ((InterfaceC16966) this.f15523).mo16481(i);
    }

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ */
    public void mo2749(C21145 c21145, BufferedOutputStream bufferedOutputStream) {
        C21767.m48527(c21145, bufferedOutputStream, (ArrayList) this.f15523);
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public void mo1179(AbstractC23903 abstractC23903) {
        ((C3836) this.f15523).f14226.mo1179(abstractC23903);
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public /* synthetic */ boolean mo1180() {
        return false;
    }

    @Override // l.InterfaceC3485
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo4815(C4751 c4751) {
        C3932 c3932 = (C3932) this.f15523;
        return c3932.m42292().getInt(c3932.m13157(), 12) + " dp";
    }

    @Override // l.InterfaceC5215
    /* JADX INFO: renamed from: ۙ */
    public void mo5013(TextView textView, Button button) {
        ViewOnClickListenerC22523.m50035(textView, ((C11731) this.f15523).m29324());
        button.setVisibility(4);
    }

    @Override // l.InterfaceC4509
    /* JADX INFO: renamed from: ۙ */
    public void mo4354(TextView textView) {
        ViewOnClickListenerC22523.m50035(textView, (CharSequence) this.f15523);
    }
}
