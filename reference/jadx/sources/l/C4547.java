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

/* JADX INFO: renamed from: l.ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4547 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C9282 f16157 = new C9282();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1564 m14288(Context context, C21701 c21701) throws PackageManager.NameNotFoundException {
        Cursor cursorMo8633;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String strM49262 = c21701.m49262();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM49262, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(C25272.m56409("No package found for authority: ", strM49262));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(c21701.m49265())) {
            StringBuilder sbM51387 = C22783.m51387("Found content provider ", strM49262, ", but package was not ");
            sbM51387.append(c21701.m49265());
            throw new PackageManager.NameNotFoundException(sbM51387.toString());
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C9282 c9282 = f16157;
        Collections.sort(arrayList, c9282);
        List listM49261 = c21701.m49261() != null ? c21701.m49261() : C6236.m17858(0, resources);
        int i = 0;
        loop1: while (true) {
            cursorMo8633 = null;
            if (i >= listM49261.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM49261.get(i));
            Collections.sort(arrayList2, c9282);
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
            return new C1564(1, null);
        }
        String str = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        InterfaceC2571 c8537 = Build.VERSION.SDK_INT < 24 ? new C8537(context, uriBuild) : new C13757(context, uriBuild);
        try {
            cursorMo8633 = c8537.mo8633(uriBuild, new String[]{aq.d, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{c21701.m49263()});
            if (cursorMo8633 != null && cursorMo8633.getCount() > 0) {
                int columnIndex = cursorMo8633.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorMo8633.getColumnIndex(aq.d);
                int columnIndex3 = cursorMo8633.getColumnIndex("file_id");
                int columnIndex4 = cursorMo8633.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorMo8633.getColumnIndex("font_weight");
                int columnIndex6 = cursorMo8633.getColumnIndex("font_italic");
                while (cursorMo8633.moveToNext()) {
                    arrayList3.add(new C11258(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorMo8633.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorMo8633.getLong(columnIndex3)), columnIndex4 != -1 ? cursorMo8633.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorMo8633.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorMo8633.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorMo8633.getInt(columnIndex) : 0));
                }
            }
            return new C1564(0, (C11258[]) arrayList3.toArray(new C11258[0]));
        } finally {
            if (cursorMo8633 != null) {
                cursorMo8633.close();
            }
            c8537.close();
        }
    }
}
