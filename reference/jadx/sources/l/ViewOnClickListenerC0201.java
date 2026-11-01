package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.umeng.commonsdk.UMConfigure;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֡ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBMC */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC0201 implements AdapterView.OnItemClickListener, View.OnClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f1337;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1338;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC22611 f1339;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public ListView f1340;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Bitmap f1341;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f1342;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public AbstractC21616 f1343;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f1344;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Bitmap f1345;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6799 f1346;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1347;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f1348;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C18377 f1349;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f1350;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6111 f1351;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ActivityC5677 f1352;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f1353;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f1354;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15725 f1355;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1356;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f1357;

    public ViewOnClickListenerC0201(AbstractC22611 abstractC22611, C6111 c6111, AbstractC21616 abstractC21616) {
        List list = Collections.EMPTY_LIST;
        this.f1344 = list;
        this.f1337 = list;
        this.f1348 = list;
        this.f1353 = list;
        this.f1354 = list;
        this.f1347 = new ArrayList();
        this.f1338 = new ArrayList();
        this.f1356 = false;
        ActivityC5677 activityC5677 = (ActivityC5677) abstractC22611.requireActivity();
        this.f1352 = activityC5677;
        this.f1339 = abstractC22611;
        this.f1351 = c6111;
        this.f1343 = abstractC21616;
        this.f1349 = (C18377) new C16717(activityC5677).m39205(C18377.class);
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        if (C20368.f65967) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C13932.m33770(13.0f));
        int iM33769 = C13932.m33769(25.0f);
        int iM337610 = C13932.m33769(12.5f);
        int iM337611 = C13932.m33769(11.0f);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = iM337610;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f1350 = Bitmap.createBitmap(iM33769, iM33769, config);
        Canvas canvas = new Canvas(this.f1350);
        AbstractC16214 abstractC16214 = C0690.f2905;
        paint.setColor(abstractC16214.mo38326());
        paint2.setColor(abstractC16214.mo38328());
        float f5 = iM337611;
        canvas.drawCircle(f3, f3, f5, paint);
        canvas.drawText("C", f3, f4, paint2);
        this.f1341 = Bitmap.createBitmap(iM33769, iM33769, config);
        Canvas canvas2 = new Canvas(this.f1341);
        AbstractC16214 abstractC16215 = C0690.f2899;
        paint.setColor(abstractC16215.mo38326());
        paint2.setColor(abstractC16215.mo38328());
        canvas2.drawCircle(f3, f3, f5, paint);
        canvas2.drawText("M", f3, f4, paint2);
        this.f1345 = Bitmap.createBitmap(iM33769, iM33769, config);
        Canvas canvas3 = new Canvas(this.f1345);
        AbstractC16214 abstractC16216 = C0690.f2879;
        paint.setColor(abstractC16216.mo38326());
        paint2.setColor(abstractC16216.mo38328());
        canvas3.drawCircle(f3, f3, f5, paint);
        canvas3.drawText("F", f3, f4, paint2);
        this.f1342 = Bitmap.createBitmap(iM33769, iM33769, config);
        Canvas canvas4 = new Canvas(this.f1342);
        AbstractC16214 abstractC16217 = C0690.f2877;
        paint.setColor(abstractC16217.mo38326());
        paint2.setColor(abstractC16217.mo38328());
        canvas4.drawCircle(f3, f3, f5, paint);
        canvas4.drawText("S", f3, f4, paint2);
        View viewM30995 = activityC5677.m30995(R.layout.MT_Protector);
        C1439 c1439 = (C1439) viewM30995.findViewById(R.id.searchView);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
        this.f1340 = listView;
        C15725 c15725 = new C15725(this);
        this.f1355 = c15725;
        listView.setAdapter((ListAdapter) c15725);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        listView.setFastScrollEnabled(true);
        C16754.m39314(listView);
        textView.setText(R.string.MT_Protector);
        c1439.m5029(new C20663(this, textView));
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(activityC5677);
        c8067.m21258(viewM30995);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21251(R.string.MT_Protector, null);
        this.f1357 = c8067.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1508(List list, List list2, List list3, List list4) {
        this.f1344 = list;
        this.f1337 = list2;
        this.f1348 = list3;
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        C23846.sort(arrayList, new Comparator() { // from class: l.᩺ۚۜ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int iM49493;
                int iM49494;
                int i;
                int iM49495;
                int iM49496;
                this.f74160.getClass();
                boolean z = obj instanceof C23028;
                if (z) {
                    iM49493 = ((C23028) obj).m50964();
                } else {
                    iM49493 = obj instanceof C22322 ? ((C22322) obj).m49493() : ((C1154) obj).m4246();
                }
                boolean z2 = obj2 instanceof C23028;
                if (z2) {
                    iM49494 = ((C23028) obj2).m50964();
                } else {
                    iM49494 = obj2 instanceof C22322 ? ((C22322) obj2).m49493() : ((C1154) obj2).m4246();
                }
                int iCompare = Integer.compare(iM49493, iM49494);
                if (iCompare != 0) {
                    return iCompare;
                }
                int i2 = 2;
                if (z) {
                    i = 0;
                } else {
                    i = obj instanceof C22322 ? 1 : 2;
                }
                if (z2) {
                    i2 = 0;
                } else if (obj2 instanceof C22322) {
                    i2 = 1;
                }
                int iCompare2 = Integer.compare(i, i2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                if (z2) {
                    iM49495 = ((C23028) obj2).m50963();
                } else {
                    iM49495 = obj2 instanceof C22322 ? ((C22322) obj2).m49495() : ((C1154) obj2).m4251();
                }
                if (z) {
                    iM49496 = ((C23028) obj).m50963();
                } else {
                    iM49496 = obj instanceof C22322 ? ((C22322) obj).m49495() : ((C1154) obj).m4251();
                }
                return Integer.compare(iM49495, iM49496);
            }
        });
        this.f1353 = arrayList;
        this.f1354 = list4;
        this.f1355.m37450();
        if (this.f1357.m44375()) {
            if (this.f1356) {
                m1494();
            } else {
                m1476();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1489(ViewOnClickListenerC0201 viewOnClickListenerC0201, Object obj, String str) {
        if (obj instanceof C23028) {
            C23028 c23028 = (C23028) obj;
            return C6851.m18463((CharSequence) c23028.m50965(), (CharSequence) str) || C6851.m18463((CharSequence) c23028.m50962(), (CharSequence) str);
        }
        if (obj instanceof C22322) {
            C22322 c22322 = (C22322) obj;
            return C6851.m18463((CharSequence) c22322.m49491(), (CharSequence) str) || C6851.m18463((CharSequence) c22322.m49492(), (CharSequence) str);
        }
        C1154 c1154 = (C1154) obj;
        return C6851.m18463((CharSequence) c1154.m4250(), (CharSequence) str) || C6851.m18463((CharSequence) c1154.m4253(), (CharSequence) str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1509() {
        this.f1355.notifyDataSetChanged();
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f1357;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44361().setOnClickListener(this);
        dialogInterfaceC19356.m44374().setOnClickListener(new View.OnClickListener() { // from class: l.᩸ۚۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC0201.m1495(this.f69502);
            }
        });
        if (this.f1356) {
            m1494();
        } else {
            m1476();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m1476() {
        Object objMo10751 = this.f1343.mo10751();
        if (objMo10751 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1347;
            if (i >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i) == objMo10751) {
                this.f1340.setSelection(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m1494() {
        this.f1346 = null;
        C6111 c6111 = this.f1351;
        int iM16916 = c6111.m16916();
        int iM17020 = c6111.m17020();
        if (iM16916 <= iM17020) {
            iM16916 = iM17020;
            iM17020 = iM16916;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1338;
            if (i >= arrayList.size()) {
                return;
            }
            C6799 c6799 = (C6799) arrayList.get(i);
            int iM18402 = c6799.m18402();
            int iM18400 = c6799.m18400();
            if (iM18402 > iM16916) {
                return;
            }
            if (iM17020 >= iM18402 && iM16916 <= iM18400) {
                this.f1346 = c6799;
                this.f1340.setSelection(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m1495(ViewOnClickListenerC0201 viewOnClickListenerC0201) {
        ActivityC5677 activityC5677 = viewOnClickListenerC0201.f1352;
        final View viewM30995 = activityC5677.m30995(R.layout.MT_Protector);
        final int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        int i = ApplicationC0716.f2992.getInt("dnm", 0);
        for (int i2 = 0; i2 < 21; i2++) {
            C12562 c12562 = (C12562) viewM30995.findViewById(iArr[i2]);
            boolean z = true;
            if (((1 << i2) & i) != 0) {
                z = false;
            }
            c12562.setChecked(z);
        }
        C8067 c8067BuildDialog = activityC5677.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟ۚۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = 0;
                for (int i5 = 0; i5 < 21; i5++) {
                    if (!((C12562) viewM30995.findViewById(iArr[i5])).isChecked()) {
                        i4 |= 1 << i5;
                    }
                }
                ApplicationC0716.f2992.edit().mo4065(i4, "dnm").apply();
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = this.f1356;
        C6111 c6111 = this.f1351;
        if (z) {
            C6799 c6799 = (C6799) this.f1338.get(i);
            c6111.mo16839(c6799.m18402(), c6799.m18400());
        } else {
            Object obj = this.f1347.get(i);
            if (obj instanceof C23028) {
                c6111.mo17029(((C23028) obj).m50964());
            } else if (obj instanceof C22322) {
                c6111.mo17029(((C22322) obj).m49493());
            } else {
                c6111.mo17029(((C1154) obj).m4246());
            }
        }
        c6111.m16992(false);
        this.f1357.dismiss();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C16195 c16195 = new C16195(view.getContext(), view, 0);
        if (this.f1356) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c16195.m38296(new InterfaceC21133() { // from class: l.۬ۚۜ
                @Override // l.InterfaceC21133
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C16737.m39272((CharSequence) ((C6799) this.f42889.f1338.get(i)).m18401());
                    return true;
                }
            });
        } else {
            Object obj = this.f1347.get(i);
            final C23028 c23028 = obj instanceof C23028 ? (C23028) obj : null;
            final C22322 c22322 = obj instanceof C22322 ? (C22322) obj : null;
            final C1154 c1154 = obj instanceof C1154 ? (C1154) obj : null;
            int i2 = ApplicationC0716.f2992.getInt("dnm", 0);
            if (c23028 != null) {
                if ((i2 & 1) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 2) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 4) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 8) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 16) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
            } else if (c22322 != null) {
                if ((i2 & 32) == 0) {
                    SubMenu subMenuAddSubMenu = c16195.m38298().addSubMenu(R.string.MT_Protector);
                    String[] stringArray = this.f1352.getResources().getStringArray(R.array.MT_Protector);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 0, 0, stringArray[0]);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 1, 0, stringArray[1]);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 2, 0, stringArray[2]);
                }
                if ((i2 & 64) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 128) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 256) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 512) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f1344.isEmpty());
                }
                if ((i2 & 1024) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f1344.isEmpty());
                }
            } else if (c1154 != null) {
                if ((i2 & 2048) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 4096) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 8192) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                int i3 = i2 & 16384;
                AbstractC22611 abstractC22611 = this.f1339;
                if (i3 == 0 && (abstractC22611 instanceof C23444)) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((32768 & i2) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((65536 & i2) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f1344.isEmpty());
                }
                if ((131072 & i2) == 0) {
                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled((this.f1344.isEmpty() || c1154.m4250().equals("<clinit>")) ? false : true);
                }
                if (abstractC22611 instanceof C23444) {
                    if ((262144 & i2) == 0) {
                        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                    if ((524288 & i2) == 0) {
                        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                    if ((i2 & 1048576) == 0) {
                        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                }
            }
            c16195.m38296(new InterfaceC21133() { // from class: l.ܶۚۜ
                @Override // l.InterfaceC21133
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return ViewOnClickListenerC0201.m1490(this.f48980, c23028, c22322, c1154, menuItem);
                }
            });
        }
        c16195.m38297();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:233:0x040a  */
    /* JADX WARN: Code duplicated, block: B:301:0x051f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1490(final ViewOnClickListenerC0201 viewOnClickListenerC0201, final C23028 c23028, final C22322 c22322, final C1154 c1154, MenuItem menuItem) {
        String strM34339;
        String strM24417;
        AbstractC22611 abstractC22611 = viewOnClickListenerC0201.f1339;
        DialogInterfaceC19356 dialogInterfaceC19356 = viewOnClickListenerC0201.f1357;
        C6111 c6111 = viewOnClickListenerC0201.f1351;
        ActivityC5677 activityC5677 = viewOnClickListenerC0201.f1352;
        final int itemId = menuItem.getItemId();
        int groupId = menuItem.getGroupId();
        if (itemId == R.string.MT_Protector) {
            if (c23028 != null) {
                strM24417 = C9561.m24416(c23028);
            } else if (c22322 != null) {
                C23028 c23028M1482 = viewOnClickListenerC0201.m1482(c22322.m49493(), c22322.m49495(), c22322.m49494());
                if (c23028M1482 != null) {
                    strM24417 = C9561.m24418(c23028M1482, c22322, viewOnClickListenerC0201.m1480(c23028M1482.m50962()));
                }
            } else if (c1154 != null) {
                C23028 c23028M1483 = viewOnClickListenerC0201.m1482(c1154.m4246(), c1154.m4251(), c1154.m4247());
                if (c23028M1483 != null) {
                    strM24417 = C9561.m24417(c23028M1483, c1154, viewOnClickListenerC0201.m1480(c23028M1483.m50962()));
                }
            }
            C16737.m39272((CharSequence) strM24417);
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            if (c23028 != null) {
                strM34339 = C14231.m34338(c23028);
            } else if (c22322 != null) {
                C23028 c23028M1484 = viewOnClickListenerC0201.m1482(c22322.m49493(), c22322.m49495(), c22322.m49494());
                if (c23028M1484 != null) {
                    strM34339 = C14231.m34340(c23028M1484, c22322);
                }
            } else if (c1154 != null) {
                C23028 c23028M1485 = viewOnClickListenerC0201.m1482(c1154.m4246(), c1154.m4251(), c1154.m4247());
                if (c23028M1485 != null) {
                    strM34339 = C14231.m34339(c23028M1485, c1154);
                }
            }
            C16737.m39272((CharSequence) strM34339);
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            activityC5677.m15658(((C23444) abstractC22611).m51659(), c1154.m4248());
            dialogInterfaceC19356.dismiss();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            activityC5677.m15659(((C23444) abstractC22611).m51659(), c1154.m4248(), (ArrayList) null, false);
            dialogInterfaceC19356.dismiss();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            C16737.m39272((CharSequence) c23028.m50962());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM1478 = viewOnClickListenerC0201.m1478(c1154);
            StringBuilder sbM8976 = C3012.m8976(strM1478 != null ? strM1478 : "???", "->");
            sbM8976.append(c1154.m4248());
            C16737.m39272((CharSequence) sbM8976.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM1479 = viewOnClickListenerC0201.m1479(c22322);
            StringBuilder sbM8977 = C3012.m8976(strM1479 != null ? strM1479 : "???", "->");
            sbM8977.append(c22322.m49490());
            C16737.m39272((CharSequence) sbM8977.toString());
            return true;
        }
        String str = "???";
        if (itemId == R.string.MT_Protector) {
            String strM14710 = viewOnClickListenerC0201.m1479(c22322);
            if (strM14710 == null) {
                strM14710 = str;
            }
            CharSequence charSequenceM1497 = viewOnClickListenerC0201.m1497(viewOnClickListenerC0201.m1479(c22322));
            boolean zContains = (charSequenceM1497 != null ? C16347.m38515(charSequenceM1497, c22322) : "").contains("static");
            StringBuilder sb = new StringBuilder(zContains ? "sget" : "iget");
            if (c22322.m49496().length() <= 1) {
                String strM49496 = c22322.m49496();
                strM49496.getClass();
                switch (strM49496) {
                    case "B":
                        sb.append("-byte");
                        break;
                    case "C":
                        sb.append("-char");
                        break;
                    case "D":
                    case "J":
                        sb.append("-wide");
                        break;
                    case "S":
                        sb.append("-short");
                        break;
                    case "Z":
                        sb.append("-boolean");
                        break;
                }
            } else {
                sb.append("-object");
            }
            sb.append(" v0, ");
            if (!zContains) {
                sb.append("v1, ");
            }
            sb.append(strM14710);
            sb.append("->");
            sb.append(c22322.m49490());
            sb.append("\n");
            C16737.m39272((CharSequence) sb.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM14711 = viewOnClickListenerC0201.m1479(c22322);
            str = strM14711 != null ? strM14711 : "???";
            CharSequence charSequenceM1498 = viewOnClickListenerC0201.m1497(viewOnClickListenerC0201.m1479(c22322));
            boolean zContains2 = (charSequenceM1498 != null ? C16347.m38515(charSequenceM1498, c22322) : "").contains("static");
            StringBuilder sb2 = new StringBuilder(zContains2 ? "sput" : "iput");
            if (c22322.m49496().length() <= 1) {
                String strM49497 = c22322.m49496();
                strM49497.getClass();
                switch (strM49497) {
                    case "B":
                        sb2.append("-byte");
                        break;
                    case "C":
                        sb2.append("-char");
                        break;
                    case "D":
                    case "J":
                        sb2.append("-wide");
                        break;
                    case "S":
                        sb2.append("-short");
                        break;
                    case "Z":
                        sb2.append("-boolean");
                        break;
                }
            } else {
                sb2.append("-object");
            }
            sb2.append(" v0, ");
            if (!zContains2) {
                sb2.append("v1, ");
            }
            sb2.append(str);
            sb2.append("->");
            sb2.append(c22322.m49490());
            sb2.append("\n");
            C16737.m39272((CharSequence) sb2.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM14712 = viewOnClickListenerC0201.m1478(c1154);
            if (strM14712 == null) {
                strM14712 = str;
            }
            CharSequence charSequenceM1499 = viewOnClickListenerC0201.m1497(viewOnClickListenerC0201.m1478(c1154));
            String[] strArr = charSequenceM1499 != null ? new String[]{C16347.m38519(charSequenceM1499), C16347.m38514(charSequenceM1499, c1154)} : new String[]{"", ""};
            String str2 = strArr[0];
            String str3 = strArr[1];
            StringBuilder sb3 = new StringBuilder("invoke");
            if (str3.contains("static")) {
                sb3.append("-static");
            } else if (str3.contains("private") || str3.contains("constructor")) {
                sb3.append("-direct");
            } else if (str2.contains("interface")) {
                sb3.append("-interface");
            } else {
                sb3.append("-virtual");
            }
            String strM4249 = c1154.m4249();
            int i = !str3.contains("static") ? 1 : 0;
            C17052 c17052 = new C17052(strM4249);
            while (true) {
                String strM39831 = c17052.m39831();
                if (strM39831 == null) {
                    break;
                }
                i = (strM39831.equals("D") || strM39831.equals("J")) ? i + 2 : i + 1;
            }
            if (i > 5) {
                sb3.append("/range {v0 .. v");
                sb3.append(i - 1);
                sb3.append("}, ");
            } else {
                sb3.append(" {");
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append('v');
                    sb3.append(i2);
                }
                sb3.append("}, ");
            }
            sb3.append(strM14712);
            sb3.append("->");
            sb3.append(c1154.m4248());
            sb3.append("\n");
            String strM4254 = c1154.m4254();
            if (strM4254.length() <= 1) {
                switch (strM4254) {
                    case "D":
                    case "J":
                        sb3.append("move-result-wide v0\n");
                        break;
                    case "V":
                        break;
                    default:
                        sb3.append("move-result v0\n");
                        break;
                }
            } else {
                sb3.append("move-result-object v0\n");
            }
            C16737.m39272((CharSequence) sb3.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            C16737.m39272((CharSequence) c6111.m17000().mo2396(c1154.m4246(), c1154.m4251()));
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                activityC5677.m15669(new Runnable() { // from class: l.ᩴۚۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC0201.m1499(this.f59013, c1154);
                    }
                });
                return true;
            }
            if (itemId == R.string.MT_Protector) {
                activityC5677.m15669(new Runnable() { // from class: l.۠ۚۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC0201.m1488(this.f26155, c23028);
                    }
                });
                return true;
            }
            if (groupId == R.string.MT_Protector) {
                activityC5677.m15669(new Runnable() { // from class: l.᩵ۚۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC0201.m1487(this.f62194, c22322, itemId);
                    }
                });
                return true;
            }
            if (itemId == R.string.MT_Protector) {
                if (c23028 != null) {
                    activityC5677.m15669(new Runnable() { // from class: l.ۡۚۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC0201.m1500(this.f29864, c23028);
                        }
                    });
                    return true;
                }
                activityC5677.m15669(new Runnable() { // from class: l.ۤۚۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC0201.m1485(this.f34421, c1154);
                    }
                });
            }
            return true;
        }
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC2916M17000, '\n', c1154.m4246() + 1);
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC2916M17000, '\n', c1154.m4251() - 1);
        String strM38516 = C16347.m38516(interfaceC2916M17000.mo2396(c1154.m4246(), iIndexOf).trim());
        boolean zContains3 = strM38516.contains("static");
        boolean z = strM38516.contains(UMConfigure.WRAPER_TYPE_NATIVE) || strM38516.contains("abstract");
        String strM18454 = C6851.m18454(' ', c6111.m16904());
        StringBuilder sb4 = new StringBuilder();
        if (!z) {
            String strM42410 = c1154.m4249();
            int i3 = !zContains3 ? 1 : 0;
            C17052 c17053 = new C17052(strM42410);
            while (true) {
                String strM39832 = c17053.m39831();
                if (strM39832 == null) {
                    break;
                }
                i3 = (strM39832.equals("D") || strM39832.equals("J")) ? i3 + 2 : i3 + 1;
            }
            String strM4255 = c1154.m4254();
            strM4255.getClass();
            switch (strM4255) {
                case "B":
                case "C":
                case "F":
                case "I":
                case "S":
                case "Z":
                    sb4.append(strM18454);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, "\n\n", strM18454, "const/4 v0, 0x0\n\n", strM18454);
                    sb4.append("return v0\n");
                    break;
                case "D":
                case "J":
                    sb4.append(strM18454);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 2));
                    ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, "\n\n", strM18454, "const-wide/16 v0, 0x0\n\n", strM18454);
                    sb4.append("return-wide v0\n");
                    break;
                case "V":
                    sb4.append(strM18454);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    C0219.m1594(sb4, "\n\n", strM18454, "return-void\n");
                    break;
                default:
                    sb4.append(strM18454);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, "\n\n", strM18454, "const/4 v0, 0x0\n\n", strM18454);
                    sb4.append("return-object v0\n");
                    break;
            }
        }
        if (iIndexOf != -1 && iLastIndexOf != -1) {
            interfaceC2916M17000.replace(iIndexOf + 1, iLastIndexOf + 1, sb4);
            c6111.mo16839(c1154.m4246(), sb4.length() + (c1154.m4251() - (iLastIndexOf - iIndexOf)));
            c6111.m16992(false);
        }
        dialogInterfaceC19356.dismiss();
        return true;
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1499(ViewOnClickListenerC0201 viewOnClickListenerC0201, C1154 c1154) {
        C14500 c14500 = new C14500();
        c14500.f47500 = 1;
        c14500.f47498 = c1154.m4248();
        String strM1478 = viewOnClickListenerC0201.m1478(c1154);
        if (strM1478 == null) {
            C15829.m37613((CharSequence) "Can not detect the class name.");
            return;
        }
        viewOnClickListenerC0201.f1357.dismiss();
        c14500.f47502 = strM1478;
        viewOnClickListenerC0201.f1349.m42639(c14500);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1488(ViewOnClickListenerC0201 viewOnClickListenerC0201, C23028 c23028) {
        C14500 c14500 = new C14500();
        c14500.f47500 = 0;
        c14500.f47502 = c23028.m50962();
        viewOnClickListenerC0201.f1357.dismiss();
        viewOnClickListenerC0201.f1349.m42655(c14500);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1487(ViewOnClickListenerC0201 viewOnClickListenerC0201, C22322 c22322, int i) {
        C14500 c14500 = new C14500();
        String strM1479 = viewOnClickListenerC0201.m1479(c22322);
        if (strM1479 == null) {
            C15829.m37613((CharSequence) "Can not detect the class name.");
            return;
        }
        c14500.f47500 = 2;
        c14500.f47498 = c22322.m49490();
        c14500.f47499 = i;
        c14500.f47502 = strM1479;
        viewOnClickListenerC0201.f1357.dismiss();
        viewOnClickListenerC0201.f1349.m42647(c14500);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1500(ViewOnClickListenerC0201 viewOnClickListenerC0201, C23028 c23028) {
        C14500 c14500 = new C14500();
        c14500.f47500 = 0;
        c14500.f47502 = c23028.m50962();
        viewOnClickListenerC0201.f1357.dismiss();
        viewOnClickListenerC0201.f1349.m42647(c14500);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1485(ViewOnClickListenerC0201 viewOnClickListenerC0201, C1154 c1154) {
        final C14500 c14500 = new C14500();
        String strM1478 = viewOnClickListenerC0201.m1478(c1154);
        if (strM1478 == null) {
            C15829.m37613((CharSequence) "Can not detect the class name.");
            return;
        }
        c14500.f47500 = 1;
        c14500.f47502 = strM1478;
        c14500.f47498 = c1154.m4248();
        final RunnableC3728 runnableC3728 = new RunnableC3728(viewOnClickListenerC0201, c14500);
        if (!c1154.m4252()) {
            runnableC3728.run();
            return;
        }
        C8067 c8067BuildDialog = viewOnClickListenerC0201.f1352.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8081(1, runnableC3728));
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۚۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                c14500.f47501 = true;
                runnableC3728.run();
            }
        });
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269().m44361().setOnClickListener(new ViewOnClickListenerC16222(1, viewOnClickListenerC0201));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1486(ViewOnClickListenerC0201 viewOnClickListenerC0201, C14500 c14500) {
        viewOnClickListenerC0201.f1357.dismiss();
        viewOnClickListenerC0201.f1349.m42647(c14500);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private CharSequence m1497(String str) {
        AbstractC22611 abstractC22611 = this.f1339;
        if (abstractC22611 instanceof C23444) {
            return this.f1351.m17000();
        }
        if (!(abstractC22611 instanceof C11718)) {
            return null;
        }
        try {
            String strM29301 = ((C11718) abstractC22611).m29301();
            if (!TextUtils.isEmpty(str) && str.startsWith("L") && str.endsWith(l.b)) {
                strM29301 = str.substring(1, str.length() - 1);
            }
            return this.f1352.m15668(strM29301);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m1507() {
        if (this.f1344.isEmpty()) {
            CharSequence charSequenceM1497 = m1497((String) null);
            if (charSequenceM1497 != null) {
                return AbstractC21616.m48325(charSequenceM1497);
            }
            return null;
        }
        return ((C23028) this.f1344.get(0)).m50962();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m1479(C22322 c22322) {
        String strM49494 = c22322.m49494();
        int iM49493 = c22322.m49493();
        int iM49495 = c22322.m49495();
        if (!TextUtils.isEmpty(strM49494)) {
            return strM49494;
        }
        C23028 c23028M1481 = m1481(iM49493, iM49495);
        if (c23028M1481 != null) {
            return c23028M1481.m50962();
        }
        return m1507();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m1478(C1154 c1154) {
        String strM4247 = c1154.m4247();
        int iM4246 = c1154.m4246();
        int iM4251 = c1154.m4251();
        if (!TextUtils.isEmpty(strM4247)) {
            return strM4247;
        }
        C23028 c23028M1481 = m1481(iM4246, iM4251);
        if (c23028M1481 != null) {
            return c23028M1481.m50962();
        }
        return m1507();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private List m1480(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f1348;
        }
        ArrayList arrayList = new ArrayList();
        for (C1154 c1154 : this.f1348) {
            if (str.equals(c1154.m4247())) {
                arrayList.add(c1154);
            }
        }
        return arrayList.isEmpty() ? this.f1348 : arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23028 m1482(int i, int i2, String str) {
        C23028 c23028;
        if (!TextUtils.isEmpty(str)) {
            Iterator it = this.f1344.iterator();
            do {
                if (!it.hasNext()) {
                    c23028 = null;
                    break;
                }
                c23028 = (C23028) it.next();
            } while (!str.equals(c23028.m50962()));
        } else {
            c23028 = null;
            break;
        }
        if (c23028 != null) {
            return c23028;
        }
        C23028 c23028M1481 = m1481(i, i2);
        if (c23028M1481 != null) {
            return c23028M1481;
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("L") || !str.endsWith(l.b)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47) + 1;
        if (iLastIndexOf == 0) {
            iLastIndexOf = 1;
        }
        return new C23028(str, C20630.m46498(1, iLastIndexOf, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23028 m1481(int i, int i2) {
        int iM50963;
        C23028 c23028 = null;
        int i3 = Integer.MAX_VALUE;
        for (C23028 c23029 : this.f1344) {
            if (i >= c23029.m50964() && i2 <= c23029.m50963() && (iM50963 = c23029.m50963() - c23029.m50964()) < i3) {
                c23028 = c23029;
                i3 = iM50963;
            }
        }
        return c23028;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.f1356 && this.f1338.isEmpty()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        boolean z = this.f1356;
        this.f1356 = !z;
        if (!z) {
            m1494();
        }
        this.f1351.postDelayed(new Runnable() { // from class: l.ᩳۚۜ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC0201.m1498(this.f56522);
            }
        }, 100L);
        this.f1355.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1498(ViewOnClickListenerC0201 viewOnClickListenerC0201) {
        if (viewOnClickListenerC0201.f1356) {
            viewOnClickListenerC0201.m1494();
        } else {
            viewOnClickListenerC0201.m1476();
        }
    }
}
