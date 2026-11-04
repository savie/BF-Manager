package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۙ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes3.dex */
public class C5155 extends C3906 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f17984;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public SeekBar f17985;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public int f17986;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f17987;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final SeekBar.OnSeekBarChangeListener f17988;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f17989;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f17990;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public boolean f17991;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final View.OnKeyListener f17992;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public boolean f17993;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public TextView f17994;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public boolean f17995;

    public C5155(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f17988 = new C2719(this);
        this.f17992 = new ViewOnKeyListenerC8685(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9430.f30595, i, 0);
        this.f17989 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i3 = this.f17989;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.f17984) {
            this.f17984 = i2;
            mo7306();
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i4 != this.f17987) {
            this.f17987 = Math.min(this.f17984 - this.f17989, Math.abs(i4));
            mo7306();
        }
        this.f17990 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f17991 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f17993 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C5155(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12570(C1228 c1228) {
        super.mo12570(c1228);
        c1228.itemView.setOnKeyListener(this.f17992);
        this.f17985 = (SeekBar) c1228.m4463(R.id.MT_Protector);
        TextView textView = (TextView) c1228.m4463(R.id.MT_Protector);
        this.f17994 = textView;
        if (this.f17991) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f17994 = null;
        }
        SeekBar seekBar = this.f17985;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f17988);
        this.f17985.setMax(this.f17984 - this.f17989);
        int i = this.f17987;
        if (i != 0) {
            this.f17985.setKeyProgressIncrement(i);
        } else {
            this.f17987 = this.f17985.getKeyProgressIncrement();
        }
        this.f17985.setProgress(this.f17986 - this.f17989);
        m15577(this.f17986);
        this.f17985.setEnabled(mo12598());
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo5998(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        m15575(m12559(((Integer) obj).intValue()), true);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5996(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15575(int i, boolean z) {
        int i2 = this.f17989;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f17984;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f17986) {
            this.f17986 = i;
            m15577(i);
            m12599(i);
            if (z) {
                mo7306();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15576(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f17989;
        if (progress != this.f17986) {
            m12566((Serializable) Integer.valueOf(progress));
            m15575(progress, false);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m15577(int i) {
        TextView textView = this.f17994;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۖ */
    public final Parcelable mo5994() {
        super.mo5994();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m12591()) {
            return absSavedState;
        }
        C13905 c13905 = new C13905();
        c13905.f44110 = this.f17986;
        c13905.f44111 = this.f17989;
        c13905.f44109 = this.f17984;
        return c13905;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo5997(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C13905.class)) {
            super.mo5997(parcelable);
            return;
        }
        C13905 c13905 = (C13905) parcelable;
        super.mo5997(c13905.getSuperState());
        this.f17986 = c13905.f44110;
        this.f17989 = c13905.f44111;
        this.f17984 = c13905.f44109;
        mo7306();
    }
}
