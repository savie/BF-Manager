package l;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5LX */
/* JADX INFO: loaded from: classes2.dex */
public class C4751 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f16707;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3485 f16708;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public Intent f16709;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f16710;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f16711;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f16712;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f16713;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f16714;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f16715;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Object f16716;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC14776 f16717;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16718;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12514 f16719;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public C5582 f16720;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Bundle f16721;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f16722;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f16723;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public Drawable f16724;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Context f16725;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16726;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public String f16727;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f16728;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f16729;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2074 f16730;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f16731;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f16732;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View.OnClickListener f16733;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f16734;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f16735;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f16736;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f16737;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f16738;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16739;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f16740;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f16741;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16742;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public ViewOnCreateContextMenuListenerC9837 f16743;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public long f16744;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public C2875 f16745;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f16746;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object mo13134(TypedArray typedArray, int i) {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13142(Object obj) {
    }

    /* JADX INFO: renamed from: ᩻ */
    public void mo8454() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4751 c4751 = (C4751) obj;
        int i = this.f16737;
        int i2 = c4751.f16737;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f16734;
        CharSequence charSequence2 = c4751.f16734;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(c4751.f16734.toString());
    }

    public C4751(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f16737 = Integer.MAX_VALUE;
        this.f16710 = true;
        this.f16718 = true;
        this.f16739 = true;
        this.f16746 = true;
        this.f16738 = true;
        this.f16726 = true;
        this.f16731 = true;
        this.f16740 = true;
        this.f16732 = true;
        this.f16742 = true;
        this.f16713 = R.layout.MT_Protector;
        this.f16733 = new ViewOnClickListenerC6308(this);
        this.f16725 = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6993.f23522, i, i2);
        this.f16711 = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f16727 = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f16734 = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f16741 = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f16737 = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f16712 = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f16713 = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.MT_Protector));
        this.f16736 = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f16710 = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f16718 = z;
        this.f16739 = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f16723 = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.f16731 = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        this.f16740 = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f16716 = mo13134(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f16716 = mo13134(typedArrayObtainStyledAttributes, 11);
        }
        this.f16742 = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f16728 = zHasValue;
        if (zHasValue) {
            this.f16732 = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.f16715 = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f16726 = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.f16735 = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C4751(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C4751(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12398.m30832(context, R.attr.MT_Protector, android.R.attr.preferenceStyle));
    }

    public C4751(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13137(Intent intent) {
        this.f16709 = intent;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Intent m13131() {
        return this.f16709;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m13152() {
        return this.f16712;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bundle m13165() {
        if (this.f16721 == null) {
            this.f16721 = new Bundle();
        }
        return this.f16721;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final void m13171() {
        this.f16713 = R.layout.MT_Protector;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m13181() {
        return this.f16713;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m13179() {
        return this.f16736;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo8452(C4170 c4170) {
        Integer numValueOf;
        View view = c4170.itemView;
        view.setOnClickListener(this.f16733);
        view.setId(0);
        TextView textView = (TextView) c4170.m11813(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceMo13159 = mo13159();
            if (!TextUtils.isEmpty(charSequenceMo13159)) {
                textView.setText(charSequenceMo13159);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            } else {
                textView.setVisibility(8);
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) c4170.m11813(android.R.id.title);
        boolean z = this.f16718;
        if (textView2 != null) {
            CharSequence charSequence = this.f16734;
            if (!TextUtils.isEmpty(charSequence)) {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f16728) {
                    textView2.setSingleLine(this.f16732);
                }
                if (!z && mo13125() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        ImageView imageView = (ImageView) c4170.m11813(android.R.id.icon);
        boolean z2 = this.f16715;
        if (imageView != null) {
            int i = this.f16711;
            if (i != 0 || this.f16724 != null) {
                if (this.f16724 == null) {
                    this.f16724 = C15945.m37904(this.f16725, i);
                }
                Drawable drawable = this.f16724;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f16724 != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z2 ? 4 : 8);
            }
        }
        View viewM11813 = c4170.m11813(R.id.MT_Protector);
        if (viewM11813 == null) {
            viewM11813 = c4170.m11813(android.R.id.icon_frame);
        }
        if (viewM11813 != null) {
            if (this.f16724 != null) {
                viewM11813.setVisibility(0);
            } else {
                viewM11813.setVisibility(z2 ? 4 : 8);
            }
        }
        if (this.f16742) {
            m13124(view, mo13125());
        } else {
            m13124(view, true);
        }
        view.setFocusable(z);
        view.setClickable(z);
        c4170.m11810(this.f16731);
        c4170.m11814(this.f16740);
        boolean z3 = this.f16735;
        if (z3 && this.f16743 == null) {
            this.f16743 = new ViewOnCreateContextMenuListenerC9837(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.f16743 : null);
        view.setLongClickable(z3);
        if (!z3 || z) {
            return;
        }
        int i2 = C5031.f17539;
        view.setBackground(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13124(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                m13124(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m13129(int i) {
        if (i != this.f16737) {
            this.f16737 = i;
            m13156();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m13173() {
        return this.f16737;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final void m13163() {
        String string = this.f16725.getString(R.string.MT_Protector);
        if (TextUtils.equals(string, this.f16734)) {
            return;
        }
        this.f16734 = string;
        mo8453();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CharSequence m13158() {
        return this.f16734;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m13160() {
        Drawable drawableM37904 = C15945.m37904(this.f16725, R.drawable.MT_Protector);
        if (this.f16724 != drawableM37904) {
            this.f16724 = drawableM37904;
            this.f16711 = 0;
            mo8453();
        }
        this.f16711 = R.drawable.MT_Protector;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13153(int i) {
        mo13141((CharSequence) this.f16725.getString(i));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13154(boolean z) {
        if (this.f16710 != z) {
            this.f16710 = z;
            mo13170(mo13155());
            mo8453();
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean mo13125() {
        return this.f16710 && this.f16746 && this.f16738;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m13180(boolean z) {
        if (this.f16726 != z) {
            this.f16726 = z;
            InterfaceC14776 interfaceC14776 = this.f16717;
            if (interfaceC14776 != null) {
                ((C23803) interfaceC14776).m52449();
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m13164() {
        return this.f16726;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long mo13126() {
        return this.f16744;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m13151() {
        this.f16727 = "ssvc";
        if (!this.f16722 || m13174()) {
            return;
        }
        if (TextUtils.isEmpty(this.f16727)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f16722 = true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m13157() {
        return this.f16727;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m13174() {
        return !TextUtils.isEmpty(this.f16727);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m13175() {
        return this.f16739;
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13127() {
        return this.f16720 != null && this.f16739 && m13174();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m13178() {
        return this.f16735;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13145(InterfaceC3485 interfaceC3485) {
        this.f16708 = interfaceC3485;
        mo8453();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13141(CharSequence charSequence) {
        if (this.f16708 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f16741, charSequence)) {
            return;
        }
        this.f16741 = charSequence;
        mo8453();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public CharSequence mo13159() {
        InterfaceC3485 interfaceC3485 = this.f16708;
        if (interfaceC3485 != null) {
            return interfaceC3485.mo4815(this);
        }
        return this.f16741;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3485 m13161() {
        return this.f16708;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13140(Serializable serializable) {
        C2875 c2875 = this.f16745;
        if (c2875 != null) {
            c2875.m8657(this, serializable);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13144(C2875 c2875) {
        this.f16745 = c2875;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13143(InterfaceC2074 interfaceC2074) {
        this.f16730 = interfaceC2074;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo9283(View view) {
        Intent intent;
        InterfaceC2759 interfaceC2759M15444;
        if (mo13125() && this.f16718) {
            mo8454();
            InterfaceC2074 interfaceC2074 = this.f16730;
            if (interfaceC2074 != null) {
                C6163 c6163 = (C6163) interfaceC2074;
                c6163.f21020.m31073(Integer.MAX_VALUE);
                c6163.f21019.m52449();
                return;
            }
            C5582 c5582 = this.f16720;
            if ((c5582 == null || (interfaceC2759M15444 = c5582.m15444()) == null || !interfaceC2759M15444.mo8422(this)) && (intent = this.f16709) != null) {
                this.f16725.startActivity(intent);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context m13133() {
        return this.f16725;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final SharedPreferences m13177() {
        C5582 c5582 = this.f16720;
        if (c5582 != null) {
            return c5582.m15457();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13149(C23803 c23803) {
        this.f16717 = c23803;
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo8453() {
        InterfaceC14776 interfaceC14776 = this.f16717;
        if (interfaceC14776 != null) {
            ((C23803) interfaceC14776).m52450(this);
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m13156() {
        InterfaceC14776 interfaceC14776 = this.f16717;
        if (interfaceC14776 != null) {
            ((C23803) interfaceC14776).m52449();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5582 m13176() {
        return this.f16720;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13146(C5582 c5582) {
        this.f16720 = c5582;
        if (!this.f16714) {
            this.f16744 = c5582.m15456();
        }
        if (!m13127() || !m13177().contains(this.f16727)) {
            Object obj = this.f16716;
            if (obj != null) {
                mo13142(obj);
                return;
            }
            return;
        }
        mo13142((Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13147(C5582 c5582, long j) {
        this.f16744 = j;
        this.f16714 = true;
        try {
            m13146(c5582);
        } finally {
            this.f16714 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13148(AbstractC12514 abstractC12514) {
        if (abstractC12514 != null && this.f16719 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f16719 = abstractC12514;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo4129() {
        String str = this.f16723;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C5582 c5582 = this.f16720;
        C4751 c4751M15446 = c5582 == null ? null : c5582.m15446((CharSequence) str);
        if (c4751M15446 == null) {
            StringBuilder sbM30914 = C12441.m30914("Dependency \"", str, "\" not found for preference \"");
            sbM30914.append(this.f16727);
            sbM30914.append("\" (title: \"");
            sbM30914.append((Object) this.f16734);
            sbM30914.append("\"");
            throw new IllegalStateException(sbM30914.toString());
        }
        if (c4751M15446.f16729 == null) {
            c4751M15446.f16729 = new ArrayList();
        }
        c4751M15446.f16729.add(this);
        boolean zMo13155 = c4751M15446.mo13155();
        if (this.f16746 == zMo13155) {
            this.f16746 = !zMo13155;
            mo13170(mo13155());
            mo8453();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo13172() {
        ArrayList arrayList;
        String str = this.f16723;
        if (str != null) {
            C5582 c5582 = this.f16720;
            C4751 c4751M15446 = c5582 == null ? null : c5582.m15446((CharSequence) str);
            if (c4751M15446 == null || (arrayList = c4751M15446.f16729) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo13170(boolean z) {
        ArrayList arrayList = this.f16729;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4751 c4751 = (C4751) arrayList.get(i);
            if (c4751.f16746 == z) {
                c4751.f16746 = !z;
                c4751.mo13170(c4751.mo13155());
                c4751.mo8453();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m13162(boolean z) {
        if (this.f16738 == z) {
            this.f16738 = !z;
            mo13170(mo13155());
            mo8453();
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean mo13155() {
        return !mo13125();
    }

    public final AbstractC12514 getParent() {
        return this.f16719;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13168(String str) {
        if (m13127() && !TextUtils.equals(str, m13135((String) null))) {
            SharedPreferences.Editor editorM15445 = this.f16720.m15445();
            editorM15445.putString(this.f16727, str);
            if (this.f16720.m15443()) {
                editorM15445.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m13135(String str) {
        return !m13127() ? str : this.f16720.m15457().getString(this.f16727, str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13169(Set set) {
        if (m13127() && !set.equals(m13136((Set) null))) {
            SharedPreferences.Editor editorM15445 = this.f16720.m15445();
            editorM15445.putStringSet(this.f16727, set);
            if (this.f16720.m15443()) {
                editorM15445.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m13136(Set set) {
        return !m13127() ? set : this.f16720.m15457().getStringSet(this.f16727, set);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13166(int i) {
        if (m13127() && i != m13132(~i)) {
            SharedPreferences.Editor editorM15445 = this.f16720.m15445();
            editorM15445.putInt(this.f16727, i);
            if (this.f16720.m15443()) {
                editorM15445.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13132(int i) {
        return !m13127() ? i : this.f16720.m15457().getInt(this.f16727, i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m13130(boolean z) {
        if (m13127() && z != m13150(!z)) {
            SharedPreferences.Editor editorM15445 = this.f16720.m15445();
            editorM15445.putBoolean(this.f16727, z);
            if (this.f16720.m15443()) {
                editorM15445.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13150(boolean z) {
        return !m13127() ? z : this.f16720.m15457().getBoolean(this.f16727, z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f16734;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceMo13159 = mo13159();
        if (!TextUtils.isEmpty(charSequenceMo13159)) {
            sb.append(charSequenceMo13159);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo13167(Bundle bundle) {
        if (m13174()) {
            this.f16707 = false;
            Parcelable parcelableMo13128 = mo13128();
            if (!this.f16707) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableMo13128 != null) {
                bundle.putParcelable(this.f16727, parcelableMo13128);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Parcelable mo13128() {
        this.f16707 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13138(Bundle bundle) {
        Parcelable parcelable;
        if (!m13174() || (parcelable = bundle.getParcelable(this.f16727)) == null) {
            return;
        }
        this.f16707 = false;
        mo13139(parcelable);
        if (!this.f16707) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13139(Parcelable parcelable) {
        this.f16707 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }
}
