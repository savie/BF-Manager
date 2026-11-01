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

/* JADX INFO: renamed from: l.᩵֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O4XG */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC19126 extends ActivityC1086 implements InterfaceC21797, InterfaceC18269 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61789 = 0;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61792;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61794;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C19832 f61791 = C19832.m45082(new C7837(this));

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C4245 f61790 = new C4245(this);

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f61793 = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ᩳ֨ۙ] */
    public ActivityC19126() {
        getSavedStateRegistry().m46525("android:support:lifecycle", new InterfaceC7284() { // from class: l.ܶ֨ۙ
            @Override // l.InterfaceC7284
            /* JADX INFO: renamed from: ۙ */
            public final Bundle mo8703() {
                int i = ActivityC19126.f61789;
                ActivityC19126 activityC19126 = this.f48657;
                activityC19126.m43944();
                activityC19126.f61790.m11902(EnumC1651.ON_STOP);
                return new Bundle();
            }
        });
        mo4079(new InterfaceC17295() { // from class: l.᩸֨ۙ
            @Override // l.InterfaceC17295
            public final void accept(Object obj) {
                this.f69199.f61791.m45095();
            }
        });
        m4080((C17714) new InterfaceC17295() { // from class: l.ᩳ֨ۙ
            @Override // l.InterfaceC17295
            public final void accept(Object obj) {
                this.f56241.f61791.m45095();
            }
        });
        m4081(new InterfaceC21985() { // from class: l.ᩴ֨ۙ
            @Override // l.InterfaceC21985
            /* JADX INFO: renamed from: ۙ */
            public final void mo16498(ActivityC1086 activityC1086) {
                this.f58738.f61791.m45087();
            }
        });
    }

    @Override // l.ActivityC1086, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f61791.m45095();
        super.onActivityResult(i, i2, intent);
    }

    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f61790.m11902(EnumC1651.ON_CREATE);
        this.f61791.m45091();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewM45086 = this.f61791.m45086(view, str, context, attributeSet);
        return viewM45086 == null ? super.onCreateView(view, str, context, attributeSet) : viewM45086;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewM45086 = this.f61791.m45086(null, str, context, attributeSet);
        return viewM45086 == null ? super.onCreateView(str, context, attributeSet) : viewM45086;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f61791.m45084();
        this.f61790.m11902(EnumC1651.ON_DESTROY);
    }

    @Override // l.ActivityC1086, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.f61791.m45088(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f61794 = false;
        this.f61791.m45089();
        this.f61790.m11902(EnumC1651.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f61791.m45095();
    }

    @Override // android.app.Activity
    public void onResume() {
        C19832 c19832 = this.f61791;
        c19832.m45095();
        super.onResume();
        this.f61794 = true;
        c19832.m45085();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f61790.m11902(EnumC1651.ON_RESUME);
        this.f61791.m45094();
    }

    @Override // android.app.Activity
    public void onStart() {
        C19832 c19832 = this.f61791;
        c19832.m45095();
        super.onStart();
        this.f61793 = false;
        if (!this.f61792) {
            this.f61792 = true;
            c19832.m45093();
        }
        c19832.m45085();
        this.f61790.m11902(EnumC1651.ON_START);
        c19832.m45083();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f61793 = true;
        m43944();
        this.f61791.m45092();
        this.f61790.m11902(EnumC1651.ON_STOP);
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
        String str3 = str + EnumC19730.f63352;
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f61792);
        printWriter.print(" mResumed=");
        printWriter.print(this.f61794);
        printWriter.print(" mStopped=");
        printWriter.print(this.f61793);
        if (getApplication() != null) {
            AbstractC5615.m15485(this).mo11857(str3, fileDescriptor, printWriter, strArr);
        }
        this.f61791.m45090().m23083(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC8894 m43943() {
        return this.f61791.m45090();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m43944() {
        while (m43942(this.f61791.m45090(), EnumC9414.CREATED)) {
        }
    }

    @Override // l.ActivityC1086, android.app.Activity, l.InterfaceC21797
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f61791.m45095();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43942(AbstractC8894 abstractC8894, EnumC9414 enumC9414) {
        boolean zM43942 = false;
        for (ComponentCallbacksC22654 componentCallbacksC22654 : abstractC8894.m23109()) {
            if (componentCallbacksC22654 != null) {
                if (componentCallbacksC22654.getHost() != null) {
                    zM43942 |= m43942(componentCallbacksC22654.getChildFragmentManager(), enumC9414);
                }
                C21324 c21324 = componentCallbacksC22654.mViewLifecycleOwner;
                if (c21324 != null && c21324.getLifecycle().mo9170().m24173(EnumC9414.STARTED)) {
                    componentCallbacksC22654.mViewLifecycleOwner.m47817(enumC9414);
                    zM43942 = true;
                }
                if (componentCallbacksC22654.mLifecycleRegistry.mo9170().m24173(EnumC9414.STARTED)) {
                    componentCallbacksC22654.mLifecycleRegistry.m11903(enumC9414);
                    zM43942 = true;
                }
            }
        }
        return zM43942;
    }
}
