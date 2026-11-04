package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B688 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17593 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ActivityC22597 f57128;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10662 f57129;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C17593(ActivityC22597 activityC22597) {
        this.f57128 = activityC22597;
        this.f57129 = activityC22597.f73046;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int[] iArr = C16847.f54320;
        C10662 c10662 = this.f57129;
        switch (iArr[c10662.m27171().ordinal()]) {
            case 1:
                return c10662.f33797.mo15674() + 3;
            case 2:
                return c10662.f33817 ? c10662.f33819 : c10662.f33813.size();
            case 3:
                return c10662.f33802.size();
            case 4:
                return c10662.f33804.mo19820();
            case 5:
                return c10662.f33816.mo4331();
            case 6:
                return c10662.f33817 ? c10662.f33819 : c10662.f33800.size();
            case 7:
            case 8:
            case 9:
                return c10662.f33820 ? c10662.f33803 : c10662.f33815.mo18154();
            case 10:
                return c10662.f33799.size();
            default:
                return 0;
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C12154 c12154;
        if (view == null) {
            view = this.f57128.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C22744.m51280(view);
            c12154 = new C12154(view);
            view.setTag(c12154);
        } else {
            c12154 = (C12154) view.getTag();
        }
        try {
            m41258(c12154, i);
            return view;
        } catch (Exception e) {
            TextView textView = c12154.f39076;
            TextView textView2 = c12154.f39077;
            TextView textView3 = c12154.f39078;
            textView.setVisibility(4);
            c12154.f39076.setText((CharSequence) null);
            textView3.setVisibility(8);
            textView3.setText((CharSequence) null);
            textView2.setSingleLine();
            textView2.setText(e.toString());
            return view;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41258(C12154 c12154, int i) {
        c12154.f39076.setVisibility(4);
        TextView textView = c12154.f39076;
        textView.setText((CharSequence) null);
        TextView textView2 = c12154.f39078;
        textView2.setVisibility(8);
        textView2.setText((CharSequence) null);
        TextView textView3 = c12154.f39077;
        textView3.setSingleLine();
        int[] iArr = C16847.f54320;
        C10662 c10662 = this.f57129;
        switch (iArr[c10662.m27171().ordinal()]) {
            case 1:
                if (i == 0) {
                    textView3.setText(R.string.MT_Protector);
                } else if (i == 1) {
                    textView3.setText(R.string.MT_Protector);
                } else if (i == 2) {
                    textView3.setText(R.string.search_by_id);
                } else {
                    textView3.setText(c10662.f33797.mo15673(i - 3).getPackageName());
                }
                break;
            case 2:
                if (c10662.f33817) {
                    textView3.setText(c10662.f33813.m15441(c10662.f33801[i]));
                } else {
                    textView3.setText(c10662.f33813.m15441(i));
                }
                break;
            case 3:
                C15883 c15883 = (C15883) c10662.f33802.get(i);
                C13304 c13304 = c15883.f51647;
                C3609 c3609 = c15883.f51648;
                textView3.setText(c13304.getPath());
                textView3.setSingleLine(false);
                textView2.setVisibility(0);
                textView2.setBackgroundColor(0);
                textView2.setTextColor(C3296.f10779);
                if (c3609 != null) {
                    textView2.setText(m41256(c10662.f33813, c3609.mo16635(), c3609.getValue(), textView2));
                } else {
                    textView2.setText(c15883.f51649);
                }
                break;
            case 4:
                C25239 c25239 = c10662.f33804;
                textView.setVisibility(0);
                textView.setText(String.format("  %02X%02X", Integer.valueOf(c25239.mo27607()), Integer.valueOf(c25239.getType(i).mo35833())));
                textView3.setText(c25239.getType(i).getTypeName());
                break;
            case 5:
                textView3.setText(c10662.f33816.mo4334(i).mo9077());
                break;
            case 6:
                if (c10662.f33817) {
                    i = c10662.f33801[i];
                }
                C13304 c13305 = (C13304) c10662.f33800.get(i);
                textView.setVisibility(0);
                textView.setText(String.format("  %04X", Integer.valueOf(c13305.mo23383())));
                m41257(c10662, c13305, c12154);
                break;
            case 7:
            case 8:
            case 9:
                if (c10662.f33820) {
                    i = c10662.f33805[i];
                }
                C3609 value = c10662.f33815.getValue(i);
                textView3.setText(c10662.f33807.m48430(value.mo16637()));
                textView2.setVisibility(0);
                textView2.setBackgroundColor(0);
                textView2.setTextColor(C3296.f10779);
                textView2.setText(m41256(c10662.f33813, value.mo16635(), value.getValue(), textView2));
                break;
            case 10:
                C13304 c13306 = (C13304) c10662.f33799.get(i);
                m41257(c10662, c13306, c12154);
                textView3.setText(c13306.getPath());
                textView3.setSingleLine(false);
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41257(C10662 c10662, C13304 c13304, C12154 c12154) {
        TextView textView = c12154.f39077;
        TextView textView2 = c12154.f39078;
        textView.setText(c13304.mo18156());
        C23747 type = c13304.getType();
        if ((type == null || !type.getTypeName().equals("id")) && !c13304.mo18155()) {
            textView2.setVisibility(0);
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C3296.f10779);
            textView2.setText(m41256(c10662.f33813, c13304.getValue(0).mo16635(), c13304.getValue(0).getValue(), textView2));
            return;
        }
        if (c13304.mo18155() && type.getTypeName().equals("style") && c13304.getParent() != 0) {
            textView2.setVisibility(0);
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C3296.f10779);
            textView2.setText(c10662.f33807.m48430(c13304.getParent()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41256(InterfaceC3412 interfaceC3412, int i, int i2, TextView textView) {
        if (i == 3) {
            return ((AbstractC5101) interfaceC3412).m15441(i2);
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
                    textView.setTextColor(C8420.m22615(i2, C3296.f10758));
                }
                textView.setBackgroundColor(i2);
            }
            return String.format("Color: %08X", Integer.valueOf(i2));
        }
        if (i == 4) {
            return C17375.m40815(i2);
        }
        if (i == 5) {
            return "Dimen: " + C19431.m44924(i2, 1) + C19431.f62791[i2 & 15];
        }
        if (i == 6) {
            int i3 = i2 & 15;
            return "Frac: " + C19431.m44924(i2, C19431.f62793[i3]) + C19431.f62792[i3];
        }
        if (i == 17) {
            return C4791.m14766(new StringBuilder("Hex: "), i2);
        }
        if (i == 16) {
            return C13645.m33382(i2, "Dec: ");
        }
        if (i == 18) {
            StringBuilder sb = new StringBuilder("Boolean: ");
            sb.append(i2 != 0);
            return sb.toString();
        }
        if (i != 0) {
            return C6934.m19217("Unknown Type ID: ", i, i2, " Data: ");
        }
        return null;
    }
}
