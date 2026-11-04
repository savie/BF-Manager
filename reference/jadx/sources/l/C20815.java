package l;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩵᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89SC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20815 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C24720 f66654 = C24720.m55194(1000);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C17930 f66655 = new C17930();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47618(AbstractActivityC17204 abstractActivityC17204) {
        final C16339 c16339 = new C16339(new AtomicReference(), abstractActivityC17204);
        f66655.m40350(abstractActivityC17204, new InterfaceC16438() { // from class: l.᩹᩶ᩴ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference != null) {
                    C3661 c3661 = (C3661) atomicReference.getAndSet(null);
                    if (c3661 != null) {
                        String str = c3661.f12530;
                        Callable callable = c3661.f12531;
                        C16339 c163310 = c16339;
                        AtomicReference atomicReference2 = (AtomicReference) c163310.f53067;
                        AbstractActivityC17204 abstractActivityC17205 = (AbstractActivityC17204) c163310.f53068;
                        WeakReference weakReference = (WeakReference) atomicReference2.get();
                        DialogInterfaceC8327 dialogInterfaceC8327 = weakReference != null ? (DialogInterfaceC8327) weakReference.get() : null;
                        if (dialogInterfaceC8327 != null && dialogInterfaceC8327.m22434()) {
                            dialogInterfaceC8327.dismiss();
                        }
                        atomicReference2.set(new WeakReference(new C3661(str, callable).m11907(abstractActivityC17205)));
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47617(C2170 c2170) {
        C3661 c3661M47615;
        if (f66654.m55200() || (c3661M47615 = m47615(c2170, false)) == null) {
            return;
        }
        f66655.mo40348(new AtomicReference(c3661M47615));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3661 m47616(AbstractC22044 abstractC22044) {
        if (abstractC22044 instanceof C2170) {
            C2170 c2170 = (C2170) abstractC22044;
            try {
                Cursor cursorQuery = C21576.m49091().query(C23053.m51956(c2170.m7465().f81685), new String[]{"document_id"}, null, null, null);
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return m47615(c2170, true);
            } catch (SecurityException | RuntimeException unused) {
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3661 m47615(final C2170 c2170, boolean z) {
        String authority = c2170.mo42888().getAuthority();
        if (authority.equals("com.android.externalstorage.documents")) {
            return null;
        }
        PackageManager packageManagerM49081 = C21576.m49081();
        for (ResolveInfo resolveInfo : packageManagerM49081.queryIntentContentProviders(new Intent("android.content.action.DOCUMENTS_PROVIDER"), 0)) {
            if (authority.equals(resolveInfo.providerInfo.authority)) {
                try {
                    final String str = resolveInfo.providerInfo.packageName;
                    String strM49059 = C21576.m49059(R.string.MT_Protector, packageManagerM49081.getPackageInfo(str, 0).applicationInfo.loadLabel(packageManagerM49081).toString());
                    if (z) {
                        strM49059 = strM49059 + "\n\n" + C21576.m49088(R.string.MT_Protector);
                    }
                    final Intent launchIntentForPackage = packageManagerM49081.getLaunchIntentForPackage(str);
                    if (launchIntentForPackage != null || (c2170 instanceof C0678)) {
                        return new C3661(strM49059, new Callable() { // from class: l.ܽ᩶ᩴ
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C2170 c2171 = c2170;
                                c2171.getClass();
                                if (c2171 instanceof C0678) {
                                    Intent intent = new Intent();
                                    intent.setClassName(str, "bin.mt.file.content.MTDataFilesWakeUpActivity");
                                    intent.addFlags(268435456);
                                    try {
                                        C21576.m49084().startActivity(intent);
                                        return null;
                                    } catch (ActivityNotFoundException unused) {
                                    }
                                }
                                Intent intent2 = launchIntentForPackage;
                                if (intent2 == null) {
                                    return null;
                                }
                                intent2.addFlags(268435456);
                                C21576.m49084().startActivity(intent2);
                                return null;
                            }
                        });
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
        }
        return null;
    }
}
