package l;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۤ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C22959 f36073 = C22959.m50799(1000);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C9186 f36074 = new C9186();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26672(AbstractActivityC12483 abstractActivityC12483) {
        final C18344 c18344 = new C18344(new AtomicReference(), abstractActivityC12483);
        f36074.m44959(abstractActivityC12483, new InterfaceC10597() { // from class: l.᩵᩷ۚ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C9124 c9124;
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference == null || (c9124 = (C9124) atomicReference.getAndSet(null)) == null) {
                    return;
                }
                String str = c9124.f31060;
                CallableC8418 callableC8418 = c9124.f31061;
                C18344 c18345 = c18344;
                AtomicReference atomicReference2 = (AtomicReference) c18345.f58512;
                AbstractActivityC12483 abstractActivityC12484 = (AbstractActivityC12483) c18345.f58513;
                WeakReference weakReference = (WeakReference) atomicReference2.get();
                DialogInterfaceC19356 dialogInterfaceC19356 = weakReference == null ? null : (DialogInterfaceC19356) weakReference.get();
                if (dialogInterfaceC19356 != null && dialogInterfaceC19356.m44375()) {
                    dialogInterfaceC19356.dismiss();
                }
                C8067 c8067BuildDialog = abstractActivityC12484.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21261(str);
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8537(1, callableC8418, abstractActivityC12484));
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                atomicReference2.set(new WeakReference(c8067BuildDialog.m21269()));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [l.۠᩷ۚ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26673(final C23235 c23235) {
        if (f36073.m50803()) {
            return;
        }
        String authority = c23235.mo40127().getAuthority();
        if (authority.equals("com.android.externalstorage.documents")) {
            return;
        }
        final PackageManager packageManagerM39292 = C16737.m39292();
        for (ResolveInfo resolveInfo : packageManagerM39292.queryIntentContentProviders(new Intent("android.content.action.DOCUMENTS_PROVIDER"), 0)) {
            if (authority.equals(resolveInfo.providerInfo.authority)) {
                try {
                    final String str = resolveInfo.providerInfo.packageName;
                    f36074.mo23641(new AtomicReference(new C9124(C16737.m39264(R.string.MT_Protector, packageManagerM39292.getPackageInfo(str, 0).applicationInfo.loadLabel(packageManagerM39292).toString()), new Callable() { // from class: l.۠᩷ۚ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            boolean z = c23235 instanceof C17589;
                            String str2 = str;
                            if (z) {
                                Intent intent = new Intent();
                                intent.setClassName(str2, "bin.mt.file.content.MTDataFilesWakeUpActivity");
                                intent.addFlags(268435456);
                                try {
                                    C16737.m39277().startActivity(intent);
                                    return null;
                                } catch (ActivityNotFoundException unused) {
                                }
                            }
                            Intent launchIntentForPackage = packageManagerM39292.getLaunchIntentForPackage(str2);
                            if (launchIntentForPackage == null) {
                                return null;
                            }
                            launchIntentForPackage.addFlags(268435456);
                            C16737.m39277().startActivity(launchIntentForPackage);
                            return null;
                        }
                    })));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }
}
