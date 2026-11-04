package l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ۗ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O4XG */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3409 extends ActivityC5577 implements InterfaceC24530, InterfaceC4392 {

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f11071 = 0;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f11073;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11076;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C14595 f11074 = C14595.m35221(new C23547(this));

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final C20168 f11072 = new C20168(this);

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f11075 = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ܽ۫ۙ] */
    public ActivityC3409() {
        getSavedStateRegistry().m36621("android:support:lifecycle", new InterfaceC19742() { // from class: l.᩻۫ۙ
            @Override // l.InterfaceC19742
            /* JADX INFO: renamed from: ۙ */
            public final Bundle mo14860() {
                int i = ActivityC3409.f11071;
                ActivityC3409 activityC3409 = this.f81009;
                activityC3409.m11154();
                activityC3409.f11072.m46395(EnumC9330.ON_STOP);
                return new Bundle();
            }
        });
        mo16526(new InterfaceC0818() { // from class: l.ܺ۫ۙ
            @Override // l.InterfaceC0818
            public final void accept(Object obj) {
                this.f54293.f11074.m35234();
            }
        });
        m16528((C17579) new InterfaceC0818() { // from class: l.ܽ۫ۙ
            @Override // l.InterfaceC0818
            public final void accept(Object obj) {
                this.f57100.f11074.m35234();
            }
        });
        m16527(new InterfaceC5928() { // from class: l.ܶ۫ۙ
            @Override // l.InterfaceC5928
            /* JADX INFO: renamed from: ۙ */
            public final void mo5165(ActivityC5577 activityC5577) {
                this.f52128.f11074.m35224();
            }
        });
    }

    @Override // l.ActivityC5577, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f11074.m35234();
        super.onActivityResult(i, i2, intent);
    }

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11072.m46395(EnumC9330.ON_CREATE);
        this.f11074.m35227();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewM35223 = this.f11074.m35223(view, str, context, attributeSet);
        return viewM35223 == null ? super.onCreateView(view, str, context, attributeSet) : viewM35223;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewM35223 = this.f11074.m35223(null, str, context, attributeSet);
        return viewM35223 == null ? super.onCreateView(str, context, attributeSet) : viewM35223;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f11074.m35233();
        this.f11072.m46395(EnumC9330.ON_DESTROY);
    }

    @Override // l.ActivityC5577, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.f11074.m35225(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f11076 = false;
        this.f11074.m35231();
        this.f11072.m46395(EnumC9330.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f11074.m35234();
    }

    @Override // android.app.Activity
    public void onResume() {
        C14595 c14595 = this.f11074;
        c14595.m35234();
        super.onResume();
        this.f11076 = true;
        c14595.m35222();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f11072.m46395(EnumC9330.ON_RESUME);
        this.f11074.m35230();
    }

    @Override // android.app.Activity
    public void onStart() {
        C14595 c14595 = this.f11074;
        c14595.m35234();
        super.onStart();
        this.f11075 = false;
        if (!this.f11073) {
            this.f11073 = true;
            c14595.m35232();
        }
        c14595.m35222();
        this.f11072.m46395(EnumC9330.ON_START);
        c14595.m35229();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f11075 = true;
        m11154();
        this.f11074.m35226();
        this.f11072.m46395(EnumC9330.ON_STOP);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + EnumC7687.f25319;
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f11073);
        printWriter.print(" mResumed=");
        printWriter.print(this.f11076);
        printWriter.print(" mStopped=");
        printWriter.print(this.f11075);
        if (getApplication() != null) {
            AbstractC0535.m2504(this).mo2506(str3, fileDescriptor, printWriter, strArr);
        }
        this.f11074.m35228().m10446(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m11154() {
        while (m11153(this.f11074.m35228(), EnumC2619.CREATED)) {
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC3191 m11155() {
        return this.f11074.m35228();
    }

    @Override // l.ActivityC5577, android.app.Activity, l.InterfaceC24530
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f11074.m35234();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11153(AbstractC3191 abstractC3191, EnumC2619 enumC2619) {
        boolean zM11153 = false;
        for (ComponentCallbacksC11612 componentCallbacksC11612 : abstractC3191.m10466()) {
            if (componentCallbacksC11612 != null) {
                if (componentCallbacksC11612.getHost() != null) {
                    zM11153 |= m11153(componentCallbacksC11612.getChildFragmentManager(), enumC2619);
                }
                C24711 c24711 = componentCallbacksC11612.mViewLifecycleOwner;
                if (c24711 != null && c24711.getLifecycle().mo23076().m8762(EnumC2619.STARTED)) {
                    componentCallbacksC11612.mViewLifecycleOwner.m55178(enumC2619);
                    zM11153 = true;
                }
                if (componentCallbacksC11612.mLifecycleRegistry.mo23076().m8762(EnumC2619.STARTED)) {
                    componentCallbacksC11612.mLifecycleRegistry.m46394(enumC2619);
                    zM11153 = true;
                }
            }
        }
        return zM11153;
    }
}
