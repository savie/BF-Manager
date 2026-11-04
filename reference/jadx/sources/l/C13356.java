package l;

import android.content.DialogInterface;
import android.net.Uri;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13356 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16997 f42589;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32933(Main main, String str) {
        C16997 c16997M41554;
        if (C5899.m17124() && (c16997M41554 = C17743.m41554(str)) != null && C5899.m17125(c16997M41554) == null) {
            f42589 = c16997M41554;
            m32936((InterfaceC15712) main, c16997M41554.f55540);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32936(InterfaceC15712 interfaceC15712, String str) {
        C2361 c2361BuildDialog = interfaceC15712.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(C21576.m49059(R.string.MT_Protector, f42589.f55539));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8845(2, str, interfaceC15712));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32935(InterfaceC15712 interfaceC15712, Uri uri) {
        C5899.f20195.clear();
        C16997 c16997 = f42589;
        if (c16997 == null) {
            return;
        }
        String str = c16997.f55540;
        String strM51955 = C23053.m51955(uri);
        boolean zEquals = false;
        if (str.equals(strM51955) && uri.getPathSegments().size() == 2) {
            zEquals = uri.getPathSegments().get(1).equals(strM51955 + ":");
        }
        if (zEquals) {
            try {
                C21576.m49091().takePersistableUriPermission(uri, 3);
                C5899.f20194.put(f42589.f55538.getPath(), C23053.m51956(uri));
                return;
            } catch (Throwable th) {
                interfaceC15712.mo37501(th);
                return;
            }
        }
        String path = uri.getPath();
        C17359.requireNonNull(path);
        int i = path.endsWith(":") ? R.string.MT_Protector : R.string.MT_Protector;
        C2361 c2361BuildDialog = interfaceC15712.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(i);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23692(interfaceC15712, 1));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }
}
