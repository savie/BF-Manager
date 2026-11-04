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

/* JADX INFO: renamed from: l.ۘۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O5LX */
/* JADX INFO: loaded from: classes2.dex */
public class C3906 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View.OnClickListener f13316;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f13317;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f13318;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f13319;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f13320;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16889 f13321;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f13322;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f13323;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f13324;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f13325;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Bundle f13326;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Context f13327;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13328;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f13329;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f13330;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Object f13331;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public Drawable f13332;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC20314 f13333;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C0482 f13334;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public Intent f13335;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f13336;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f13337;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f13338;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public long f13339;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f13340;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC12109 f13341;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public ViewOnCreateContextMenuListenerC6144 f13342;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f13343;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC24044 f13344;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f13345;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f13346;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f13347;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13348;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f13349;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f13350;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13351;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f13352;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13353;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13354;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C9663 f13355;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void mo12556() {
    }

    /* JADX INFO: renamed from: ۙ */
    public Object mo5996(TypedArray typedArray, int i) {
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo5998(Object obj) {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3906 c3906 = (C3906) obj;
        int i = this.f13340;
        int i2 = c3906.f13340;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f13317;
        CharSequence charSequence2 = c3906.f13317;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(c3906.f13317.toString());
    }

    public C3906(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f13340 = Integer.MAX_VALUE;
        this.f13329 = true;
        this.f13354 = true;
        this.f13348 = true;
        this.f13330 = true;
        this.f13353 = true;
        this.f13328 = true;
        this.f13337 = true;
        this.f13349 = true;
        this.f13338 = true;
        this.f13322 = true;
        this.f13319 = R.layout.MT_Protector;
        this.f13316 = new ViewOnClickListenerC15838(this);
        this.f13327 = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9430.f30592, i, i2);
        this.f13352 = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f13324 = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f13317 = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f13350 = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f13340 = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f13336 = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f13319 = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.MT_Protector));
        this.f13346 = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f13329 = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f13354 = z;
        this.f13348 = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f13318 = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.f13337 = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        this.f13349 = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f13331 = mo5996(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f13331 = mo5996(typedArrayObtainStyledAttributes, 11);
        }
        this.f13322 = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f13351 = zHasValue;
        if (zHasValue) {
            this.f13338 = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.f13347 = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f13328 = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.f13345 = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C3906(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C3906(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506.m8385(context, R.attr.MT_Protector, android.R.attr.preferenceStyle));
    }

    public C3906(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12563(Intent intent) {
        this.f13335 = intent;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Intent m12587() {
        return this.f13335;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m12593() {
        return this.f13336;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Bundle m12605() {
        if (this.f13326 == null) {
            this.f13326 = new Bundle();
        }
        return this.f13326;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m12577() {
        this.f13319 = R.layout.MT_Protector;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m12585() {
        return this.f13319;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m12609() {
        return this.f13346;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo12570(C1228 c1228) {
        Integer numValueOf;
        View view = c1228.itemView;
        view.setOnClickListener(this.f13316);
        view.setId(0);
        TextView textView = (TextView) c1228.m4463(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceMo12597 = mo12597();
            if (!TextUtils.isEmpty(charSequenceMo12597)) {
                textView.setText(charSequenceMo12597);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            } else {
                textView.setVisibility(8);
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) c1228.m4463(android.R.id.title);
        boolean z = this.f13354;
        if (textView2 != null) {
            CharSequence charSequence = this.f13317;
            if (!TextUtils.isEmpty(charSequence)) {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f13351) {
                    textView2.setSingleLine(this.f13338);
                }
                if (!z && mo12598() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        ImageView imageView = (ImageView) c1228.m4463(android.R.id.icon);
        boolean z2 = this.f13347;
        if (imageView != null) {
            int i = this.f13352;
            if (i != 0 || this.f13332 != null) {
                if (this.f13332 == null) {
                    this.f13332 = C0385.m2186(this.f13327, i);
                }
                Drawable drawable = this.f13332;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f13332 != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z2 ? 4 : 8);
            }
        }
        View viewM4463 = c1228.m4463(R.id.MT_Protector);
        if (viewM4463 == null) {
            viewM4463 = c1228.m4463(android.R.id.icon_frame);
        }
        if (viewM4463 != null) {
            if (this.f13332 != null) {
                viewM4463.setVisibility(0);
            } else {
                viewM4463.setVisibility(z2 ? 4 : 8);
            }
        }
        if (this.f13322) {
            m12554(view, mo12598());
        } else {
            m12554(view, true);
        }
        view.setFocusable(z);
        view.setClickable(z);
        c1228.m4460(this.f13337);
        c1228.m4464(this.f13349);
        boolean z3 = this.f13345;
        if (z3 && this.f13342 == null) {
            this.f13342 = new ViewOnCreateContextMenuListenerC6144(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.f13342 : null);
        view.setLongClickable(z3);
        if (!z3 || z) {
            return;
        }
        int i2 = C22666.f73603;
        view.setBackground(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12554(View view, boolean z) {
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
                m12554(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m12606(int i) {
        if (i != this.f13340) {
            this.f13340 = i;
            m12592();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m12610() {
        return this.f13340;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m12604() {
        String string = this.f13327.getString(R.string.MT_Protector);
        if (TextUtils.equals(string, this.f13317)) {
            return;
        }
        this.f13317 = string;
        mo7306();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final CharSequence m12578() {
        return this.f13317;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m12580() {
        Drawable drawableM2186 = C0385.m2186(this.f13327, R.drawable.MT_Protector);
        if (this.f13332 != drawableM2186) {
            this.f13332 = drawableM2186;
            this.f13352 = 0;
            mo7306();
        }
        this.f13352 = R.drawable.MT_Protector;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m12594(int i) {
        mo12567((CharSequence) this.f13327.getString(i));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m12595(boolean z) {
        if (this.f13329 != z) {
            this.f13329 = z;
            mo12603(mo12584());
            mo7306();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean mo12598() {
        return this.f13329 && this.f13330 && this.f13353;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m12589(boolean z) {
        if (this.f13328 != z) {
            this.f13328 = z;
            InterfaceC20314 interfaceC20314 = this.f13333;
            if (interfaceC20314 != null) {
                ((C3465) interfaceC20314).m11421();
            }
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m12555() {
        return this.f13328;
    }

    public long getId() {
        return this.f13339;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m12579() {
        this.f13324 = "ssvc";
        if (!this.f13325 || m12558()) {
            return;
        }
        if (TextUtils.isEmpty(this.f13324)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f13325 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m12557() {
        return this.f13324;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m12558() {
        return !TextUtils.isEmpty(this.f13324);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m12591() {
        return this.f13348;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12596() {
        return this.f13334 != null && this.f13348 && m12558();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m12588() {
        return this.f13345;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12575(InterfaceC24044 interfaceC24044) {
        this.f13344 = interfaceC24044;
        mo7306();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo12567(CharSequence charSequence) {
        if (this.f13344 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f13350, charSequence)) {
            return;
        }
        this.f13350 = charSequence;
        mo7306();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24044 m12586() {
        return this.f13344;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public CharSequence mo12597() {
        InterfaceC24044 interfaceC24044 = this.f13344;
        if (interfaceC24044 != null) {
            return interfaceC24044.mo6271(this);
        }
        return this.f13350;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12566(Serializable serializable) {
        C9663 c9663 = this.f13355;
        if (c9663 != null) {
            c9663.m25176(this, serializable);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12572(C9663 c9663) {
        this.f13355 = c9663;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12573(InterfaceC12109 interfaceC12109) {
        this.f13341 = interfaceC12109;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo12565(View view) {
        Intent intent;
        InterfaceC18381 interfaceC18381M2341;
        if (mo12598() && this.f13354) {
            mo12556();
            InterfaceC12109 interfaceC12109 = this.f13341;
            if (interfaceC12109 != null) {
                C16143 c16143 = (C16143) interfaceC12109;
                c16143.f52431.m39847(Integer.MAX_VALUE);
                c16143.f52430.m11421();
                return;
            }
            C0482 c0482 = this.f13334;
            if ((c0482 == null || (interfaceC18381M2341 = c0482.m2341()) == null || !interfaceC18381M2341.mo16736(this)) && (intent = this.f13335) != null) {
                this.f13327.startActivity(intent);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context m12560() {
        return this.f13327;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final SharedPreferences m12608() {
        C0482 c0482 = this.f13334;
        if (c0482 != null) {
            return c0482.m2338();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12571(C3465 c3465) {
        this.f13333 = c3465;
    }

    /* JADX INFO: renamed from: ۟ */
    public void mo7306() {
        InterfaceC20314 interfaceC20314 = this.f13333;
        if (interfaceC20314 != null) {
            ((C3465) interfaceC20314).m11422(this);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m12592() {
        InterfaceC20314 interfaceC20314 = this.f13333;
        if (interfaceC20314 != null) {
            ((C3465) interfaceC20314).m11421();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0482 m12590() {
        return this.f13334;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12568(C0482 c0482) {
        this.f13334 = c0482;
        if (!this.f13323) {
            this.f13339 = c0482.m2340();
        }
        if (!m12596() || !m12608().contains(this.f13324)) {
            Object obj = this.f13331;
            if (obj != null) {
                mo5998(obj);
                return;
            }
            return;
        }
        mo5998((Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12569(C0482 c0482, long j) {
        this.f13339 = j;
        this.f13323 = true;
        try {
            m12568(c0482);
        } finally {
            this.f13323 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12574(AbstractC16889 abstractC16889) {
        if (abstractC16889 != null && this.f13321 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f13321 = abstractC16889;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public void mo12582() {
        String str = this.f13318;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0482 c0482 = this.f13334;
        C3906 c3906M2328 = c0482 == null ? null : c0482.m2328((CharSequence) str);
        if (c3906M2328 == null) {
            StringBuilder sbM51387 = C22783.m51387("Dependency \"", str, "\" not found for preference \"");
            sbM51387.append(this.f13324);
            sbM51387.append("\" (title: \"");
            sbM51387.append((Object) this.f13317);
            sbM51387.append("\"");
            throw new IllegalStateException(sbM51387.toString());
        }
        if (c3906M2328.f13320 == null) {
            c3906M2328.f13320 = new ArrayList();
        }
        c3906M2328.f13320.add(this);
        boolean zMo12584 = c3906M2328.mo12584();
        if (this.f13330 == zMo12584) {
            this.f13330 = !zMo12584;
            mo12603(mo12584());
            mo7306();
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public void mo12581() {
        ArrayList arrayList;
        String str = this.f13318;
        if (str != null) {
            C0482 c0482 = this.f13334;
            C3906 c3906M2328 = c0482 == null ? null : c0482.m2328((CharSequence) str);
            if (c3906M2328 == null || (arrayList = c3906M2328.f13320) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo12603(boolean z) {
        ArrayList arrayList = this.f13320;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3906 c3906 = (C3906) arrayList.get(i);
            if (c3906.f13330 == z) {
                c3906.f13330 = !z;
                c3906.mo12603(c3906.mo12584());
                c3906.mo7306();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m12583(boolean z) {
        if (this.f13353 == z) {
            this.f13353 = !z;
            mo12603(mo12584());
            mo7306();
        }
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean mo12584() {
        return !mo12598();
    }

    public final AbstractC16889 getParent() {
        return this.f13321;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12601(String str) {
        if (m12596() && !TextUtils.equals(str, m12561((String) null))) {
            SharedPreferences.Editor editorM2327 = this.f13334.m2327();
            editorM2327.putString(this.f13324, str);
            if (this.f13334.m2337()) {
                editorM2327.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12561(String str) {
        return !m12596() ? str : this.f13334.m2338().getString(this.f13324, str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12602(Set set) {
        if (m12596() && !set.equals(m12562((Set) null))) {
            SharedPreferences.Editor editorM2327 = this.f13334.m2327();
            editorM2327.putStringSet(this.f13324, set);
            if (this.f13334.m2337()) {
                editorM2327.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m12562(Set set) {
        return !m12596() ? set : this.f13334.m2338().getStringSet(this.f13324, set);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12599(int i) {
        if (m12596() && i != m12559(~i)) {
            SharedPreferences.Editor editorM2327 = this.f13334.m2327();
            editorM2327.putInt(this.f13324, i);
            if (this.f13334.m2337()) {
                editorM2327.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12559(int i) {
        return !m12596() ? i : this.f13334.m2338().getInt(this.f13324, i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m12607(boolean z) {
        if (m12596() && z != m12576(!z)) {
            SharedPreferences.Editor editorM2327 = this.f13334.m2327();
            editorM2327.putBoolean(this.f13324, z);
            if (this.f13334.m2337()) {
                editorM2327.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12576(boolean z) {
        return !m12596() ? z : this.f13334.m2338().getBoolean(this.f13324, z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f13317;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceMo12597 = mo12597();
        if (!TextUtils.isEmpty(charSequenceMo12597)) {
            sb.append(charSequenceMo12597);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo12600(Bundle bundle) {
        if (m12558()) {
            this.f13343 = false;
            Parcelable parcelableMo5994 = mo5994();
            if (!this.f13343) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableMo5994 != null) {
                bundle.putParcelable(this.f13324, parcelableMo5994);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public Parcelable mo5994() {
        this.f13343 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo12564(Bundle bundle) {
        Parcelable parcelable;
        if (!m12558() || (parcelable = bundle.getParcelable(this.f13324)) == null) {
            return;
        }
        this.f13343 = false;
        mo5997(parcelable);
        if (!this.f13343) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo5997(Parcelable parcelable) {
        this.f13343 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }
}
