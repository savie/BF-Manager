package l;

import android.content.Context;
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

/* JADX INFO: renamed from: l.ۨۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBMC */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC12166 implements AdapterView.OnItemClickListener, View.OnClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f39105;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C7449 f39106;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C24132 f39107;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f39108;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C22761 f39109;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Bitmap f39110;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f39111;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC9051 f39112;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f39113;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f39114;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39115;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39116;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Bitmap f39117;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ActivityC0848 f39118;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f39119;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f39120;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f39121;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AbstractC21775 f39122;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C3217 f39123;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f39124;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public ListView f39125;

    public ViewOnClickListenerC12166(AbstractC9051 abstractC9051, C24132 c24132, AbstractC21775 abstractC21775) {
        List list = Collections.EMPTY_LIST;
        this.f39114 = list;
        this.f39120 = list;
        this.f39111 = list;
        this.f39105 = list;
        this.f39121 = list;
        this.f39115 = new ArrayList();
        this.f39116 = new ArrayList();
        this.f39119 = false;
        ActivityC0848 activityC0848 = (ActivityC0848) abstractC9051.requireActivity();
        this.f39118 = activityC0848;
        this.f39112 = abstractC9051;
        this.f39107 = c24132;
        this.f39122 = abstractC21775;
        this.f39109 = (C22761) new C16196(activityC0848).m38422(C22761.class);
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        if (C3296.f10755) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C6907.m19161(13.0f));
        int iM19160 = C6907.m19160(25.0f);
        int iM19161 = C6907.m19160(12.5f);
        int iM19162 = C6907.m19160(11.0f);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = iM19161;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f39124 = Bitmap.createBitmap(iM19160, iM19160, config);
        Canvas canvas = new Canvas(this.f39124);
        AbstractC23597 abstractC23597 = C20613.f66106;
        paint.setColor(abstractC23597.mo36859());
        paint2.setColor(abstractC23597.mo36860());
        float f5 = iM19162;
        canvas.drawCircle(f3, f3, f5, paint);
        canvas.drawText("C", f3, f4, paint2);
        this.f39117 = Bitmap.createBitmap(iM19160, iM19160, config);
        Canvas canvas2 = new Canvas(this.f39117);
        AbstractC23597 abstractC23598 = C20613.f66082;
        paint.setColor(abstractC23598.mo36859());
        paint2.setColor(abstractC23598.mo36860());
        canvas2.drawCircle(f3, f3, f5, paint);
        canvas2.drawText("M", f3, f4, paint2);
        this.f39110 = Bitmap.createBitmap(iM19160, iM19160, config);
        Canvas canvas3 = new Canvas(this.f39110);
        AbstractC23597 abstractC23599 = C20613.f66098;
        paint.setColor(abstractC23599.mo36859());
        paint2.setColor(abstractC23599.mo36860());
        canvas3.drawCircle(f3, f3, f5, paint);
        canvas3.drawText("F", f3, f4, paint2);
        this.f39108 = Bitmap.createBitmap(iM19160, iM19160, config);
        Canvas canvas4 = new Canvas(this.f39108);
        AbstractC23597 abstractC235910 = C20613.f66063;
        paint.setColor(abstractC235910.mo36859());
        paint2.setColor(abstractC235910.mo36860());
        canvas4.drawCircle(f3, f3, f5, paint);
        canvas4.drawText("S", f3, f4, paint2);
        View viewM40395 = activityC0848.m40395(R.layout.MT_Protector);
        C7308 c7308 = (C7308) viewM40395.findViewById(R.id.searchView);
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
        this.f39125 = listView;
        C3217 c3217 = new C3217(this);
        this.f39123 = c3217;
        listView.setAdapter((ListAdapter) c3217);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        listView.setFastScrollEnabled(true);
        C18597.m43179(listView);
        textView.setText(R.string.MT_Protector);
        c7308.m20007(new C23355(this, textView));
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(activityC0848);
        c2361.m8005(viewM40395);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8026(R.string.MT_Protector, null);
        this.f39113 = c2361.m7999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30403(List list, List list2, List list3, List list4) {
        this.f39114 = list;
        this.f39120 = list2;
        this.f39111 = list3;
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        C12884.sort(arrayList, new Comparator() { // from class: l.ᩴۛۧ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int iM5282;
                int iM5283;
                int i;
                int iM5284;
                int iM5285;
                this.f63242.getClass();
                boolean z = obj instanceof C14160;
                if (z) {
                    iM5282 = ((C14160) obj).m34387();
                } else {
                    iM5282 = obj instanceof C1483 ? ((C1483) obj).m5282() : ((C9685) obj).m25269();
                }
                boolean z2 = obj2 instanceof C14160;
                if (z2) {
                    iM5283 = ((C14160) obj2).m34387();
                } else {
                    iM5283 = obj2 instanceof C1483 ? ((C1483) obj2).m5282() : ((C9685) obj2).m25269();
                }
                int iCompare = Integer.compare(iM5282, iM5283);
                if (iCompare != 0) {
                    return iCompare;
                }
                int i2 = 2;
                if (z) {
                    i = 0;
                } else {
                    i = obj instanceof C1483 ? 1 : 2;
                }
                if (z2) {
                    i2 = 0;
                } else if (obj2 instanceof C1483) {
                    i2 = 1;
                }
                int iCompare2 = Integer.compare(i, i2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                if (z2) {
                    iM5284 = ((C14160) obj2).m34386();
                } else {
                    iM5284 = obj2 instanceof C1483 ? ((C1483) obj2).m5283() : ((C9685) obj2).m25268();
                }
                if (z) {
                    iM5285 = ((C14160) obj).m34386();
                } else {
                    iM5285 = obj instanceof C1483 ? ((C1483) obj).m5283() : ((C9685) obj).m25268();
                }
                return Integer.compare(iM5284, iM5285);
            }
        });
        this.f39105 = arrayList;
        this.f39121 = list4;
        this.f39123.m10558();
        if (this.f39113.m22434()) {
            if (this.f39119) {
                m30385();
            } else {
                m30399();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30382(ViewOnClickListenerC12166 viewOnClickListenerC12166, Object obj, String str) {
        if (obj instanceof C14160) {
            C14160 c14160 = (C14160) obj;
            return C24276.m54287(c14160.m34388(), str) || C24276.m54287(c14160.m34389(), str);
        }
        if (obj instanceof C1483) {
            C1483 c1483 = (C1483) obj;
            return C24276.m54287(c1483.m5284(), str) || C24276.m54287(c1483.m5277(), str);
        }
        C9685 c9685 = (C9685) obj;
        return C24276.m54287(c9685.m25271(), str) || C24276.m54287(c9685.m25272(), str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30404() {
        this.f39123.notifyDataSetChanged();
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f39113;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22440().setOnClickListener(this);
        dialogInterfaceC8327.m22433().setOnClickListener(new View.OnClickListener() { // from class: l.۫ۛۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC12166.m30386(this.f41286);
            }
        });
        if (this.f39119) {
            m30385();
        } else {
            m30399();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m30399() {
        Object objMo14424 = this.f39122.mo14424();
        if (objMo14424 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f39115;
            if (i >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i) == objMo14424) {
                this.f39125.setSelection(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m30385() {
        this.f39106 = null;
        C24132 c24132 = this.f39107;
        int iM53968 = c24132.m53968();
        int iM53882 = c24132.m53882();
        if (iM53968 <= iM53882) {
            iM53968 = iM53882;
            iM53882 = iM53968;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f39116;
            if (i >= arrayList.size()) {
                return;
            }
            C7449 c7449 = (C7449) arrayList.get(i);
            int iM20408 = c7449.m20408();
            int iM20406 = c7449.m20406();
            if (iM20408 > iM53968) {
                return;
            }
            if (iM53882 >= iM20408 && iM53968 <= iM20406) {
                this.f39106 = c7449;
                this.f39125.setSelection(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m30386(ViewOnClickListenerC12166 viewOnClickListenerC12166) {
        ActivityC0848 activityC0848 = viewOnClickListenerC12166.f39118;
        final View viewM40395 = activityC0848.m40395(R.layout.MT_Protector);
        final int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        int i = ApplicationC17729.f58258.getInt("dnm", 0);
        for (int i2 = 0; i2 < 21; i2++) {
            C1255 c1255 = (C1255) viewM40395.findViewById(iArr[i2]);
            boolean z = true;
            if (((1 << i2) & i) != 0) {
                z = false;
            }
            c1255.setChecked(z);
        }
        C2361 c2361BuildDialog = activityC0848.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶۛۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = 0;
                for (int i5 = 0; i5 < 21; i5++) {
                    if (!((C1255) viewM40395.findViewById(iArr[i5])).isChecked()) {
                        i4 |= 1 << i5;
                    }
                }
                ApplicationC17729.f58258.edit().mo3486(i4, "dnm").apply();
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = this.f39119;
        C24132 c24132 = this.f39107;
        if (z) {
            C7449 c7449 = (C7449) this.f39116.get(i);
            c24132.mo52316(c7449.m20408(), c7449.m20406());
        } else {
            Object obj = this.f39115.get(i);
            if (obj instanceof C14160) {
                c24132.mo52339(((C14160) obj).m34387());
            } else if (obj instanceof C1483) {
                c24132.mo52339(((C1483) obj).m5282());
            } else {
                c24132.mo52339(((C9685) obj).m25269());
            }
        }
        c24132.m54077(false);
        this.f39113.dismiss();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C18452 c18452 = new C18452(view.getContext(), view, 0);
        if (this.f39119) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c18452.m42994(new InterfaceC21436() { // from class: l.ۙۛۧ
                @Override // l.InterfaceC21436
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C21576.m49067((CharSequence) ((C7449) this.f16614.f39116.get(i)).m20407());
                    return true;
                }
            });
        } else {
            Object obj = this.f39115.get(i);
            final C14160 c14160 = obj instanceof C14160 ? (C14160) obj : null;
            final C1483 c1483 = obj instanceof C1483 ? (C1483) obj : null;
            final C9685 c9685 = obj instanceof C9685 ? (C9685) obj : null;
            int i2 = ApplicationC17729.f58258.getInt("dnm", 0);
            if (c14160 != null) {
                if ((i2 & 1) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 2) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 4) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 8) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 16) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
            } else if (c1483 != null) {
                if ((i2 & 32) == 0) {
                    SubMenu subMenuAddSubMenu = c18452.m42995().addSubMenu(R.string.MT_Protector);
                    String[] stringArray = this.f39118.getResources().getStringArray(R.array.MT_Protector);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 0, 0, stringArray[0]);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 1, 0, stringArray[1]);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 2, 0, stringArray[2]);
                }
                if ((i2 & 64) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 128) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 256) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 512) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f39114.isEmpty());
                }
                if ((i2 & 1024) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f39114.isEmpty());
                }
            } else if (c9685 != null) {
                if ((i2 & 2048) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 4096) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 8192) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                int i3 = i2 & 16384;
                AbstractC9051 abstractC9051 = this.f39112;
                if (i3 == 0 && (abstractC9051 instanceof C16332)) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((32768 & i2) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((65536 & i2) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f39114.isEmpty());
                }
                if ((131072 & i2) == 0) {
                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled((this.f39114.isEmpty() || c9685.m25271().equals("<clinit>")) ? false : true);
                }
                if (abstractC9051 instanceof C16332) {
                    if ((262144 & i2) == 0) {
                        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                    if ((524288 & i2) == 0) {
                        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                    if ((i2 & 1048576) == 0) {
                        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                }
            }
            c18452.m42994(new InterfaceC21436() { // from class: l.ܳۛۧ
                @Override // l.InterfaceC21436
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return ViewOnClickListenerC12166.m30383(this.f49424, c14160, c1483, c9685, menuItem);
                }
            });
        }
        c18452.mo21878();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:233:0x040a  */
    /* JADX WARN: Code duplicated, block: B:301:0x051f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30383(final ViewOnClickListenerC12166 viewOnClickListenerC12166, final C14160 c14160, final C1483 c1483, final C9685 c9685, MenuItem menuItem) {
        String strM42693;
        String strM2846;
        AbstractC9051 abstractC9051 = viewOnClickListenerC12166.f39112;
        DialogInterfaceC8327 dialogInterfaceC8327 = viewOnClickListenerC12166.f39113;
        C24132 c24132 = viewOnClickListenerC12166.f39107;
        ActivityC0848 activityC0848 = viewOnClickListenerC12166.f39118;
        final int itemId = menuItem.getItemId();
        int groupId = menuItem.getGroupId();
        if (itemId == R.string.MT_Protector) {
            if (c14160 != null) {
                strM2846 = C0649.m2844(c14160);
            } else if (c1483 != null) {
                C14160 c14160M30375 = viewOnClickListenerC12166.m30375(c1483.m5282(), c1483.m5283(), c1483.m5279());
                if (c14160M30375 != null) {
                    strM2846 = C0649.m2845(c14160M30375, c1483, viewOnClickListenerC12166.m30373(c14160M30375.m34389()));
                }
            } else if (c9685 != null) {
                C14160 c14160M30376 = viewOnClickListenerC12166.m30375(c9685.m25269(), c9685.m25268(), c9685.m25273());
                if (c14160M30376 != null) {
                    strM2846 = C0649.m2846(c14160M30376, c9685, viewOnClickListenerC12166.m30373(c14160M30376.m34389()));
                }
            }
            C21576.m49067((CharSequence) strM2846);
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            if (c14160 != null) {
                strM42693 = C18307.m42691(c14160);
            } else if (c1483 != null) {
                C14160 c14160M30377 = viewOnClickListenerC12166.m30375(c1483.m5282(), c1483.m5283(), c1483.m5279());
                if (c14160M30377 != null) {
                    strM42693 = C18307.m42692(c14160M30377, c1483);
                }
            } else if (c9685 != null) {
                C14160 c14160M30378 = viewOnClickListenerC12166.m30375(c9685.m25269(), c9685.m25268(), c9685.m25273());
                if (c14160M30378 != null) {
                    strM42693 = C18307.m42693(c14160M30378, c9685);
                }
            }
            C21576.m49067((CharSequence) strM42693);
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            activityC0848.m3429(((C16332) abstractC9051).m38820(), c9685.m25265());
            dialogInterfaceC8327.dismiss();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            activityC0848.m3430(((C16332) abstractC9051).m38820(), c9685.m25265(), (ArrayList) null, false);
            dialogInterfaceC8327.dismiss();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            C21576.m49067((CharSequence) c14160.m34389());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM30372 = viewOnClickListenerC12166.m30372(c9685);
            StringBuilder sbM10405 = C3188.m10405(strM30372 != null ? strM30372 : "???", "->");
            sbM10405.append(c9685.m25265());
            C21576.m49067((CharSequence) sbM10405.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM30371 = viewOnClickListenerC12166.m30371(c1483);
            StringBuilder sbM10406 = C3188.m10405(strM30371 != null ? strM30371 : "???", "->");
            sbM10406.append(c1483.m5278());
            C21576.m49067((CharSequence) sbM10406.toString());
            return true;
        }
        String str = "???";
        if (itemId == R.string.MT_Protector) {
            String strM30373 = viewOnClickListenerC12166.m30371(c1483);
            if (strM30373 == null) {
                strM30373 = str;
            }
            CharSequence charSequenceM30394 = viewOnClickListenerC12166.m30394(viewOnClickListenerC12166.m30371(c1483));
            boolean zContains = (charSequenceM30394 != null ? C12340.m30759(charSequenceM30394, c1483) : "").contains("static");
            StringBuilder sb = new StringBuilder(zContains ? "sget" : "iget");
            if (c1483.m5281().length() <= 1) {
                String strM5281 = c1483.m5281();
                strM5281.getClass();
                switch (strM5281) {
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
            sb.append(strM30373);
            sb.append("->");
            sb.append(c1483.m5278());
            sb.append("\n");
            C21576.m49067((CharSequence) sb.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM30374 = viewOnClickListenerC12166.m30371(c1483);
            str = strM30374 != null ? strM30374 : "???";
            CharSequence charSequenceM30395 = viewOnClickListenerC12166.m30394(viewOnClickListenerC12166.m30371(c1483));
            boolean zContains2 = (charSequenceM30395 != null ? C12340.m30759(charSequenceM30395, c1483) : "").contains("static");
            StringBuilder sb2 = new StringBuilder(zContains2 ? "sput" : "iput");
            if (c1483.m5281().length() <= 1) {
                String strM5282 = c1483.m5281();
                strM5282.getClass();
                switch (strM5282) {
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
            sb2.append(c1483.m5278());
            sb2.append("\n");
            C21576.m49067((CharSequence) sb2.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM30375 = viewOnClickListenerC12166.m30372(c9685);
            if (strM30375 == null) {
                strM30375 = str;
            }
            CharSequence charSequenceM30396 = viewOnClickListenerC12166.m30394(viewOnClickListenerC12166.m30372(c9685));
            String[] strArr = charSequenceM30396 != null ? new String[]{C12340.m30764(charSequenceM30396), C12340.m30760(charSequenceM30396, c9685)} : new String[]{"", ""};
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
            String strM25266 = c9685.m25266();
            int i = !str3.contains("static") ? 1 : 0;
            C24275 c24275 = new C24275(strM25266);
            while (true) {
                String strM54278 = c24275.m54278();
                if (strM54278 == null) {
                    break;
                }
                i = (strM54278.equals("D") || strM54278.equals("J")) ? i + 2 : i + 1;
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
            sb3.append(strM30375);
            sb3.append("->");
            sb3.append(c9685.m25265());
            sb3.append("\n");
            String strM25270 = c9685.m25270();
            if (strM25270.length() <= 1) {
                switch (strM25270) {
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
            C21576.m49067((CharSequence) sb3.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            C21576.m49067((CharSequence) c24132.m54021().mo15351(c9685.m25269(), c9685.m25268()));
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                activityC0848.m3436(new Runnable() { // from class: l.֫ۛۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC12166.m30396(this.f5883, c9685);
                    }
                });
                return true;
            }
            if (itemId == R.string.MT_Protector) {
                activityC0848.m3436(new Runnable() { // from class: l.ۧۛۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC12166.m30380(this.f35913, c14160);
                    }
                });
                return true;
            }
            if (groupId == R.string.MT_Protector) {
                activityC0848.m3436(new Runnable() { // from class: l.᩻ۛۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC12166.m30378(this.f80352, c1483, itemId);
                    }
                });
                return true;
            }
            if (itemId == R.string.MT_Protector) {
                if (c14160 != null) {
                    activityC0848.m3436(new Runnable() { // from class: l.ܺۛۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC12166.m30397(this.f53785, c14160);
                        }
                    });
                    return true;
                }
                activityC0848.m3436(new Runnable() { // from class: l.ܽۛۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC12166.m30379(this.f56544, c9685);
                    }
                });
            }
            return true;
        }
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC19106M54021, '\n', c9685.m25269() + 1);
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC19106M54021, '\n', c9685.m25268() - 1);
        String strM30761 = C12340.m30761(interfaceC19106M54021.mo15351(c9685.m25269(), iIndexOf).trim());
        boolean zContains3 = strM30761.contains("static");
        boolean z = strM30761.contains(UMConfigure.WRAPER_TYPE_NATIVE) || strM30761.contains("abstract");
        String strM54280 = C24276.m54280(' ', c24132.m54057());
        StringBuilder sb4 = new StringBuilder();
        if (!z) {
            String strM25267 = c9685.m25266();
            int i3 = !zContains3 ? 1 : 0;
            C24275 c24276 = new C24275(strM25267);
            while (true) {
                String strM54279 = c24276.m54278();
                if (strM54279 == null) {
                    break;
                }
                i3 = (strM54279.equals("D") || strM54279.equals("J")) ? i3 + 2 : i3 + 1;
            }
            String strM25271 = c9685.m25270();
            strM25271.getClass();
            switch (strM25271) {
                case "B":
                case "C":
                case "F":
                case "I":
                case "S":
                case "Z":
                    sb4.append(strM54280);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    C4794.m14774(sb4, "\n\n", strM54280, "const/4 v0, 0x0\n\n", strM54280);
                    sb4.append("return v0\n");
                    break;
                case "D":
                case "J":
                    sb4.append(strM54280);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 2));
                    C4794.m14774(sb4, "\n\n", strM54280, "const-wide/16 v0, 0x0\n\n", strM54280);
                    sb4.append("return-wide v0\n");
                    break;
                case "V":
                    sb4.append(strM54280);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    C22121.m50078(sb4, "\n\n", strM54280, "return-void\n");
                    break;
                default:
                    sb4.append(strM54280);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    C4794.m14774(sb4, "\n\n", strM54280, "const/4 v0, 0x0\n\n", strM54280);
                    sb4.append("return-object v0\n");
                    break;
            }
        }
        if (iIndexOf != -1 && iLastIndexOf != -1) {
            interfaceC19106M54021.replace(iIndexOf + 1, iLastIndexOf + 1, sb4);
            c24132.mo52316(c9685.m25269(), sb4.length() + (c9685.m25268() - (iLastIndexOf - iIndexOf)));
            c24132.m54077(false);
        }
        dialogInterfaceC8327.dismiss();
        return true;
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30396(ViewOnClickListenerC12166 viewOnClickListenerC12166, C9685 c9685) {
        C21532 c21532 = new C21532();
        c21532.f68797 = 1;
        c21532.f68800 = c9685.m25265();
        String strM30372 = viewOnClickListenerC12166.m30372(c9685);
        if (strM30372 == null) {
            C22673.m51154((CharSequence) "Can not detect the class name.");
            return;
        }
        viewOnClickListenerC12166.f39113.dismiss();
        c21532.f68799 = strM30372;
        viewOnClickListenerC12166.f39109.m51316(c21532);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30380(ViewOnClickListenerC12166 viewOnClickListenerC12166, C14160 c14160) {
        C21532 c21532 = new C21532();
        c21532.f68797 = 0;
        c21532.f68799 = c14160.m34389();
        viewOnClickListenerC12166.f39113.dismiss();
        viewOnClickListenerC12166.f39109.m51331(c21532);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30378(ViewOnClickListenerC12166 viewOnClickListenerC12166, C1483 c1483, int i) {
        C21532 c21532 = new C21532();
        String strM30371 = viewOnClickListenerC12166.m30371(c1483);
        if (strM30371 == null) {
            C22673.m51154((CharSequence) "Can not detect the class name.");
            return;
        }
        c21532.f68797 = 2;
        c21532.f68800 = c1483.m5278();
        c21532.f68798 = c1483.m5280();
        c21532.f68795 = i;
        c21532.f68799 = strM30371;
        viewOnClickListenerC12166.f39113.dismiss();
        viewOnClickListenerC12166.f39109.m51319(c21532);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30397(ViewOnClickListenerC12166 viewOnClickListenerC12166, C14160 c14160) {
        C21532 c21532 = new C21532();
        c21532.f68797 = 0;
        c21532.f68799 = c14160.m34389();
        viewOnClickListenerC12166.f39113.dismiss();
        viewOnClickListenerC12166.f39109.m51319(c21532);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30379(final ViewOnClickListenerC12166 viewOnClickListenerC12166, C9685 c9685) {
        C21532 c21532 = new C21532();
        String strM30372 = viewOnClickListenerC12166.m30372(c9685);
        if (strM30372 == null) {
            C22673.m51154((CharSequence) "Can not detect the class name.");
            return;
        }
        c21532.f68797 = 1;
        c21532.f68799 = strM30372;
        c21532.f68800 = c9685.m25265();
        final RunnableC21863 runnableC21863 = new RunnableC21863(viewOnClickListenerC12166, c21532);
        if (!c9685.m25267()) {
            runnableC21863.run();
            return;
        }
        C2361 c2361BuildDialog = viewOnClickListenerC12166.f39118.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤۛۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnableC21863.run();
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19503(1, c21532, runnableC21863));
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016().m22440().setOnClickListener(new View.OnClickListener() { // from class: l.᩸ۛۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC20934.m47864((Context) this.f73067.f39118, C13047.m32482(), false);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30381(ViewOnClickListenerC12166 viewOnClickListenerC12166, C21532 c21532) {
        viewOnClickListenerC12166.f39113.dismiss();
        viewOnClickListenerC12166.f39109.m51319(c21532);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private CharSequence m30394(String str) {
        AbstractC9051 abstractC9051 = this.f39112;
        if (abstractC9051 instanceof C16332) {
            return this.f39107.m54021();
        }
        if (!(abstractC9051 instanceof C0168)) {
            return null;
        }
        try {
            String strM1441 = ((C0168) abstractC9051).m1441();
            if (!TextUtils.isEmpty(str) && str.startsWith("L") && str.endsWith(l.b)) {
                strM1441 = str.substring(1, str.length() - 1);
            }
            return this.f39118.m3435(strM1441);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30402() {
        if (this.f39114.isEmpty()) {
            CharSequence charSequenceM30394 = m30394((String) null);
            if (charSequenceM30394 != null) {
                return AbstractC21775.m49367(charSequenceM30394);
            }
            return null;
        }
        return ((C14160) this.f39114.get(0)).m34389();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m30371(C1483 c1483) {
        String strM5279 = c1483.m5279();
        int iM5282 = c1483.m5282();
        int iM5283 = c1483.m5283();
        if (!TextUtils.isEmpty(strM5279)) {
            return strM5279;
        }
        C14160 c14160M30374 = m30374(iM5282, iM5283);
        if (c14160M30374 != null) {
            return c14160M30374.m34389();
        }
        return m30402();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m30372(C9685 c9685) {
        String strM25273 = c9685.m25273();
        int iM25269 = c9685.m25269();
        int iM25268 = c9685.m25268();
        if (!TextUtils.isEmpty(strM25273)) {
            return strM25273;
        }
        C14160 c14160M30374 = m30374(iM25269, iM25268);
        if (c14160M30374 != null) {
            return c14160M30374.m34389();
        }
        return m30402();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private List m30373(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f39111;
        }
        ArrayList arrayList = new ArrayList();
        for (C9685 c9685 : this.f39111) {
            if (str.equals(c9685.m25273())) {
                arrayList.add(c9685);
            }
        }
        return arrayList.isEmpty() ? this.f39111 : arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14160 m30375(int i, int i2, String str) {
        C14160 c14160;
        if (!TextUtils.isEmpty(str)) {
            Iterator it = this.f39114.iterator();
            do {
                if (!it.hasNext()) {
                    c14160 = null;
                    break;
                }
                c14160 = (C14160) it.next();
            } while (!str.equals(c14160.m34389()));
        } else {
            c14160 = null;
            break;
        }
        if (c14160 != null) {
            return c14160;
        }
        C14160 c14160M30374 = m30374(i, i2);
        if (c14160M30374 != null) {
            return c14160M30374;
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("L") || !str.endsWith(l.b)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47) + 1;
        if (iLastIndexOf == 0) {
            iLastIndexOf = 1;
        }
        return new C14160(str, C1402.m5124(1, iLastIndexOf, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14160 m30374(int i, int i2) {
        int iM34386;
        C14160 c14160 = null;
        int i3 = Integer.MAX_VALUE;
        for (C14160 c14161 : this.f39114) {
            if (i >= c14161.m34387() && i2 <= c14161.m34386() && (iM34386 = c14161.m34386() - c14161.m34387()) < i3) {
                c14160 = c14161;
                i3 = iM34386;
            }
        }
        return c14160;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.f39119 && this.f39116.isEmpty()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        boolean z = this.f39119;
        this.f39119 = !z;
        if (!z) {
            m30385();
        }
        this.f39107.postDelayed(new Runnable() { // from class: l.ۚۛۧ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC12166.m30395(this.f19049);
            }
        }, 100L);
        this.f39123.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30395(ViewOnClickListenerC12166 viewOnClickListenerC12166) {
        if (viewOnClickListenerC12166.f39119) {
            viewOnClickListenerC12166.m30385();
        } else {
            viewOnClickListenerC12166.m30399();
        }
    }
}
