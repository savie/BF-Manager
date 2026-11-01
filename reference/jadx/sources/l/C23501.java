package l;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.umeng.analytics.pro.aq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes.dex */
public final class C23501 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C16445 f76081 = new C16445(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2477 m51755(Context context, C14329 c14329) {
        Cursor cursorMo27096;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String strM34585 = c14329.m34585();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM34585, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(C0252.m1693("No package found for authority: ", strM34585));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(c14329.m34582())) {
            StringBuilder sbM30914 = C12441.m30914("Found content provider ", strM34585, ", but package was not ");
            sbM30914.append(c14329.m34582());
            throw new PackageManager.NameNotFoundException(sbM30914.toString());
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C16445 c16445 = f76081;
        Collections.sort(arrayList, c16445);
        List listM34583 = c14329.m34583() != null ? c14329.m34583() : C21569.m48285(resources, 0);
        int i = 0;
        loop1: while (true) {
            cursorMo27096 = null;
            if (i >= listM34583.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM34583.get(i));
            Collections.sort(arrayList2, c16445);
            if (arrayList.size() == arrayList2.size()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new C2477(1, null);
        }
        String str = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        InterfaceC12212 c17150 = Build.VERSION.SDK_INT < 24 ? new C17150(context, uriBuild) : new C10801(context, uriBuild);
        try {
            cursorMo27096 = c17150.mo27096(uriBuild, new String[]{aq.d, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{c14329.m34584()});
            if (cursorMo27096 != null && cursorMo27096.getCount() > 0) {
                int columnIndex = cursorMo27096.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorMo27096.getColumnIndex(aq.d);
                int columnIndex3 = cursorMo27096.getColumnIndex("file_id");
                int columnIndex4 = cursorMo27096.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorMo27096.getColumnIndex("font_weight");
                int columnIndex6 = cursorMo27096.getColumnIndex("font_italic");
                while (cursorMo27096.moveToNext()) {
                    arrayList3.add(new C5300(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorMo27096.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorMo27096.getLong(columnIndex3)), columnIndex4 != -1 ? cursorMo27096.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorMo27096.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorMo27096.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorMo27096.getInt(columnIndex) : 0));
                }
            }
            return new C2477(0, (C5300[]) arrayList3.toArray(new C5300[0]));
        } finally {
            if (cursorMo27096 != null) {
                cursorMo27096.close();
            }
            c17150.close();
        }
    }
}
