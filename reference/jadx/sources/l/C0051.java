package l;

import android.graphics.Bitmap;
import bin.mt.plugin.api.ui.PluginTextView;
import bin.mt.plugin.api.util.Consumer;
import java.io.IOException;

/* JADX INFO: renamed from: l.֡֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y20N */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0051 implements InterfaceC7359, InterfaceC16464, Consumer, InterfaceC18189 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f915;

    public /* synthetic */ C0051(Object obj) {
        this.f915 = obj;
    }

    public /* synthetic */ C0051(C19602 c19602, C13863 c13863, C13157 c13157, IOException iOException, boolean z) {
        this.f915 = c13157;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo42471accept(Object obj) {
        ((PluginTextView) this.f915).setText((CharSequence) obj);
    }

    @Override // l.InterfaceC18189
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String mo948() {
        C23444 c23444 = (C23444) this.f915;
        return c23444.m51657(c23444.f75896, c23444.f75912);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).mo26346((C13157) this.f915);
    }

    @Override // l.InterfaceC16464
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap mo947() {
        return C5443.m15048((InterfaceC13911) this.f915);
    }
}
