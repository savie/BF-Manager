package l;

import android.content.DialogInterface;
import android.net.Uri;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4183 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18149 f15234;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11826(Main main, String str) {
        C18149 c18149M21690;
        if (C7006.m18815() && (c18149M21690 = C8272.m21690(str)) != null && C7006.m18816(c18149M21690) == null) {
            f15234 = c18149M21690;
            m11829((InterfaceC17421) main, c18149M21690.f58037);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11829(InterfaceC17421 interfaceC17421, String str) {
        C8067 c8067BuildDialog = interfaceC17421.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(C16737.m39264(R.string.MT_Protector, f15234.f58040));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5864(2, str, interfaceC17421));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11828(InterfaceC17421 interfaceC17421, Uri uri) {
        C7006.f23574.clear();
        C18149 c18149 = f15234;
        if (c18149 == null) {
            return;
        }
        String str = c18149.f58037;
        String strM50044 = C22529.m50044(uri);
        boolean zEquals = false;
        if (str.equals(strM50044) && uri.getPathSegments().size() == 2) {
            zEquals = uri.getPathSegments().get(1).equals(strM50044 + ":");
        }
        if (zEquals) {
            try {
                C16737.m39259().takePersistableUriPermission(uri, 3);
                C7006.f23573.put(f15234.f58039.getPath(), C22529.m50046(uri));
                return;
            } catch (Throwable th) {
                interfaceC17421.mo31001(th);
                return;
            }
        }
        String path = uri.getPath();
        C13638.requireNonNull(path);
        int i = path.endsWith(":") ? R.string.MT_Protector : R.string.MT_Protector;
        C8067 c8067BuildDialog = interfaceC17421.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(i);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10804(interfaceC17421, 1));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }
}
