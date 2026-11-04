package l;

import android.content.pm.ShortcutManager;
import android.widget.TextView;
import java.io.File;
import java.lang.invoke.MethodHandle;

/* JADX INFO: renamed from: l.ܶۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16076 implements InterfaceC19795, InterfaceC20727, InterfaceC10523, InterfaceC23285, InterfaceC4501, InterfaceC10344 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m38223() {
        return ShortcutManager.class;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38224(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m38225() {
        return MethodHandle.class;
    }

    @Override // l.InterfaceC10344
    public void accept(Object obj) {
        C0147.m1305((File) obj);
    }

    @Override // l.InterfaceC20727
    public InterfaceC12522 get() {
        int i = C14584.f45961;
        return null;
    }

    @Override // l.InterfaceC4501
    /* JADX INFO: renamed from: ۙ */
    public int mo12193(String str, boolean z) {
        C24720 c24720 = C14941.f48783;
        return 1;
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    @Override // l.InterfaceC23285
    /* JADX INFO: renamed from: ۙ */
    public String mo25860(C25368 c25368) {
        String str = c25368.f81911;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Media cache key is missing");
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        textView.setText("0");
    }
}
