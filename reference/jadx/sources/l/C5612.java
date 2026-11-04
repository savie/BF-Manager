package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۚۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5612 implements InterfaceC5392, InterfaceC21100, InterfaceC24044, InterfaceC17972, InterfaceC17544 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19443;

    public /* synthetic */ C5612(Object obj) {
        this.f19443 = obj;
    }

    @Override // l.InterfaceC17972
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ void mo16589() {
    }

    @Override // l.InterfaceC17972
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo16590(Bundle bundle, String str) {
        ViewOnClickListenerC20698 viewOnClickListenerC20698 = (ViewOnClickListenerC20698) this.f19443;
        viewOnClickListenerC20698.m47341(new Runnable() { // from class: l.ۜܺۧ
            @Override // java.lang.Runnable
            public final void run() {
                String string = bundle.getString(MotionUtils.EASING_TYPE_PATH);
                ViewOnClickListenerC20698 viewOnClickListenerC20699 = viewOnClickListenerC20698;
                new C16968(viewOnClickListenerC20699, (AbstractActivityC17204) viewOnClickListenerC20699.requireActivity(), str, string).m8197();
            }
        });
    }

    @Override // l.InterfaceC24044
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo6271(C3906 c3906) {
        String string;
        Context context = (Context) this.f19443;
        String strM40856 = C17394.m40856();
        if (strM40856.isEmpty()) {
            return context.getString(R.string.MT_Protector);
        }
        if (strM40856.equals("com.android.vending")) {
            string = context.getString(R.string.MT_Protector);
        } else {
            PackageManager packageManager = context.getPackageManager();
            try {
                string = packageManager.getApplicationInfo(strM40856, 0).loadLabel(packageManager).toString();
            } catch (PackageManager.NameNotFoundException unused) {
                return strM40856;
            }
        }
        return string + " (" + strM40856 + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(final int i) {
        final InterfaceC17544 interfaceC17544 = (InterfaceC17544) this.f19443;
        C21576.m49068(new Runnable() { // from class: l.֫ۧܺ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC17544.mo1209(i);
            }
        });
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        C1663.m5983((C8614) this.f19443, abstractC22044);
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        return C8275.m22342((InterfaceC0817) this.f19443);
    }
}
