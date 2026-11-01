package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B688 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18418 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ActivityC13125 f58718;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1129 f58719;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C18418(ActivityC13125 activityC13125) {
        this.f58718 = activityC13125;
        this.f58719 = activityC13125.f43713;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int[] iArr = C17712.f56237;
        C1129 c1129 = this.f58719;
        switch (iArr[c1129.m4162().ordinal()]) {
            case 1:
                return c1129.f5091.mo5141() + 3;
            case 2:
                return c1129.f5073 ? c1129.f5075 : c1129.f5092.size();
            case 3:
                return c1129.f5081.size();
            case 4:
                return c1129.f5080.mo7941();
            case 5:
                return c1129.f5083.mo1536();
            case 6:
                return c1129.f5073 ? c1129.f5075 : c1129.f5082.size();
            case 7:
            case 8:
            case 9:
                return c1129.f5095 ? c1129.f5078 : c1129.f5085.mo7647();
            case 10:
                return c1129.f5096.size();
            default:
                return 0;
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C15948 c15948;
        if (view == null) {
            view = this.f58718.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C2766.m8438(view);
            c15948 = new C15948(view);
            view.setTag(c15948);
        } else {
            c15948 = (C15948) view.getTag();
        }
        try {
            m42710(c15948, i);
            return view;
        } catch (Exception e) {
            TextView textView = c15948.f51655;
            TextView textView2 = c15948.f51656;
            TextView textView3 = c15948.f51657;
            textView.setVisibility(4);
            c15948.f51655.setText((CharSequence) null);
            textView3.setVisibility(8);
            textView3.setText((CharSequence) null);
            textView2.setSingleLine();
            textView2.setText(e.toString());
            return view;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42710(C15948 c15948, int i) {
        c15948.f51655.setVisibility(4);
        TextView textView = c15948.f51655;
        textView.setText((CharSequence) null);
        TextView textView2 = c15948.f51657;
        textView2.setVisibility(8);
        textView2.setText((CharSequence) null);
        TextView textView3 = c15948.f51656;
        textView3.setSingleLine();
        int[] iArr = C17712.f56237;
        C1129 c1129 = this.f58719;
        switch (iArr[c1129.m4162().ordinal()]) {
            case 1:
                if (i == 0) {
                    textView3.setText(R.string.MT_Protector);
                } else if (i == 1) {
                    textView3.setText(R.string.MT_Protector);
                } else if (i == 2) {
                    textView3.setText(R.string.search_by_id);
                } else {
                    textView3.setText(c1129.f5091.mo5140(i - 3).getPackageName());
                }
                break;
            case 2:
                if (c1129.f5073) {
                    textView3.setText(c1129.f5092.m10939(c1129.f5084[i]));
                } else {
                    textView3.setText(c1129.f5092.m10939(i));
                }
                break;
            case 3:
                C8892 c8892 = (C8892) c1129.f5081.get(i);
                C18551 c18551 = c8892.f30480;
                C16435 c16435 = c8892.f30481;
                textView3.setText(c18551.getPath());
                textView3.setSingleLine(false);
                textView2.setVisibility(0);
                textView2.setBackgroundColor(0);
                textView2.setTextColor(C20368.f66009);
                if (c16435 != null) {
                    textView2.setText(m42708(c1129.f5092, c16435.mo25192(), c16435.getValue(), textView2));
                } else {
                    textView2.setText(c8892.f30482);
                }
                break;
            case 4:
                C7262 c7262 = c1129.f5080;
                textView.setVisibility(0);
                textView.setText(String.format("  %02X%02X", Integer.valueOf(c7262.mo19106()), Integer.valueOf(c7262.getType(i).mo26942())));
                textView3.setText(c7262.getType(i).getTypeName());
                break;
            case 5:
                textView3.setText(c1129.f5083.mo1530(i).mo31755());
                break;
            case 6:
                if (c1129.f5073) {
                    i = c1129.f5084[i];
                }
                C18551 c18552 = (C18551) c1129.f5082.get(i);
                textView.setVisibility(0);
                textView.setText(String.format("  %04X", Integer.valueOf(c18552.mo10691())));
                m42709(c1129, c18552, c15948);
                break;
            case 7:
            case 8:
            case 9:
                if (c1129.f5095) {
                    i = c1129.f5076[i];
                }
                C16435 value = c1129.f5085.getValue(i);
                textView3.setText(c1129.f5097.m16375(value.mo25193()));
                textView2.setVisibility(0);
                textView2.setBackgroundColor(0);
                textView2.setTextColor(C20368.f66009);
                textView2.setText(m42708(c1129.f5092, value.mo25192(), value.getValue(), textView2));
                break;
            case 10:
                C18551 c18553 = (C18551) c1129.f5096.get(i);
                m42709(c1129, c18553, c15948);
                textView3.setText(c18553.getPath());
                textView3.setSingleLine(false);
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42709(C1129 c1129, C18551 c18551, C15948 c15948) {
        TextView textView = c15948.f51656;
        TextView textView2 = c15948.f51657;
        textView.setText(c18551.mo7645());
        C0206 type = c18551.getType();
        if ((type == null || !type.getTypeName().equals("id")) && !c18551.mo7644()) {
            textView2.setVisibility(0);
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C20368.f66009);
            textView2.setText(m42708(c1129.f5092, c18551.getValue(0).mo25192(), c18551.getValue(0).getValue(), textView2));
            return;
        }
        if (c18551.mo7644() && type.getTypeName().equals("style") && c18551.getParent() != 0) {
            textView2.setVisibility(0);
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C20368.f66009);
            textView2.setText(c1129.f5097.m16375(c18551.getParent()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42708(InterfaceC5727 interfaceC5727, int i, int i2, TextView textView) {
        if (i == 3) {
            return ((AbstractC3733) interfaceC5727).m10939(i2);
        }
        if (i == 1 || i == 7) {
            return String.format("Ref: @%08X", Integer.valueOf(i2));
        }
        if (i == 2 || i == 8) {
            return String.format("Attr: ?%08X", Integer.valueOf(i2));
        }
        if (i >= 28 && i <= 31) {
            if (textView != null) {
                if (((i2 >>> 24) & 255) > 64) {
                    textView.setTextColor(C3057.m9163(i2, C20368.f66007));
                }
                textView.setBackgroundColor(i2);
            }
            return String.format("Color: %08X", Integer.valueOf(i2));
        }
        if (i == 4) {
            return C19475.m44533(i2);
        }
        if (i == 5) {
            return "Dimen: " + C12479.m30979(i2, 1) + C12479.f41599[i2 & 15];
        }
        if (i == 6) {
            int i3 = i2 & 15;
            return "Frac: " + C12479.m30979(i2, C12479.f41601[i3]) + C12479.f41600[i3];
        }
        if (i == 17) {
            return C9576.m24440(new StringBuilder("Hex: "), i2);
        }
        if (i == 16) {
            return C8479.m22141(i2, "Dec: ");
        }
        if (i == 18) {
            StringBuilder sb = new StringBuilder("Boolean: ");
            sb.append(i2 != 0);
            return sb.toString();
        }
        if (i != 0) {
            return C2271.m6967("Unknown Type ID: ", i, i2, " Data: ");
        }
        return null;
    }
}
