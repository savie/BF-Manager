package l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

/* JADX INFO: renamed from: l.ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G58J */
/* JADX INFO: loaded from: classes4.dex */
public class C18540 {
    public final C6545 P;
    public final int mTheme;

    public C18540(Context context) {
        this(context, DialogInterfaceC7957.m21013(context, 0));
    }

    public C18540(Context context, int i) {
        this.P = new C6545(new ContextThemeWrapper(context, DialogInterfaceC7957.m21013(context, i)));
        this.mTheme = i;
    }

    public Context getContext() {
        return this.P.f22052;
    }

    public C18540 setTitle(int i) {
        C6545 c6545 = this.P;
        c6545.f22045 = c6545.f22052.getText(i);
        return this;
    }

    public C18540 setTitle(CharSequence charSequence) {
        this.P.f22045 = charSequence;
        return this;
    }

    public C18540 setCustomTitle(View view) {
        this.P.f22044 = view;
        return this;
    }

    public C18540 setMessage(int i) {
        C6545 c6545 = this.P;
        c6545.f22057 = c6545.f22052.getText(i);
        return this;
    }

    public C18540 setMessage(CharSequence charSequence) {
        this.P.f22057 = charSequence;
        return this;
    }

    public C18540 setIcon(int i) {
        this.P.f22049 = i;
        return this;
    }

    public C18540 setIcon(Drawable drawable) {
        this.P.f22065 = drawable;
        return this;
    }

    public C18540 setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        this.P.f22052.getTheme().resolveAttribute(i, typedValue, true);
        this.P.f22049 = typedValue.resourceId;
        return this;
    }

    public C18540 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22068 = c6545.f22052.getText(i);
        this.P.f22081 = onClickListener;
        return this;
    }

    public C18540 setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22068 = charSequence;
        c6545.f22081 = onClickListener;
        return this;
    }

    public C18540 setPositiveButtonIcon(Drawable drawable) {
        this.P.f22061 = drawable;
        return this;
    }

    public C18540 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22060 = c6545.f22052.getText(i);
        this.P.f22058 = onClickListener;
        return this;
    }

    public C18540 setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22060 = charSequence;
        c6545.f22058 = onClickListener;
        return this;
    }

    public C18540 setNegativeButtonIcon(Drawable drawable) {
        this.P.f22075 = drawable;
        return this;
    }

    public C18540 setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22070 = c6545.f22052.getText(i);
        this.P.f22077 = onClickListener;
        return this;
    }

    public C18540 setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22070 = charSequence;
        c6545.f22077 = onClickListener;
        return this;
    }

    public C18540 setNeutralButtonIcon(Drawable drawable) {
        this.P.f22056 = drawable;
        return this;
    }

    public C18540 setCancelable(boolean z) {
        this.P.f22066 = z;
        return this;
    }

    public C18540 setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.P.f22076 = onCancelListener;
        return this;
    }

    public C18540 setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.P.f22064 = onDismissListener;
        return this;
    }

    public C18540 setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.P.f22054 = onKeyListener;
        return this;
    }

    public C18540 setItems(int i, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22073 = c6545.f22052.getResources().getTextArray(i);
        this.P.f22071 = onClickListener;
        return this;
    }

    public C18540 setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22073 = charSequenceArr;
        c6545.f22071 = onClickListener;
        return this;
    }

    public C18540 setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22050 = listAdapter;
        c6545.f22071 = onClickListener;
        return this;
    }

    public C18540 setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        C6545 c6545 = this.P;
        c6545.f22079 = cursor;
        c6545.f22074 = str;
        c6545.f22071 = onClickListener;
        return this;
    }

    public C18540 setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C6545 c6545 = this.P;
        c6545.f22073 = c6545.f22052.getResources().getTextArray(i);
        C6545 c6546 = this.P;
        c6546.f22043 = onMultiChoiceClickListener;
        c6546.f22046 = zArr;
        c6546.f22069 = true;
        return this;
    }

    public C18540 setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C6545 c6545 = this.P;
        c6545.f22073 = charSequenceArr;
        c6545.f22043 = onMultiChoiceClickListener;
        c6545.f22046 = zArr;
        c6545.f22069 = true;
        return this;
    }

    public C18540 setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C6545 c6545 = this.P;
        c6545.f22079 = cursor;
        c6545.f22043 = onMultiChoiceClickListener;
        c6545.f22080 = str;
        c6545.f22074 = str2;
        c6545.f22069 = true;
        return this;
    }

    public C18540 setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22073 = c6545.f22052.getResources().getTextArray(i);
        C6545 c6546 = this.P;
        c6546.f22071 = onClickListener;
        c6546.f22062 = i2;
        c6546.f22078 = true;
        return this;
    }

    public C18540 setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22079 = cursor;
        c6545.f22071 = onClickListener;
        c6545.f22062 = i;
        c6545.f22074 = str;
        c6545.f22078 = true;
        return this;
    }

    public C18540 setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22073 = charSequenceArr;
        c6545.f22071 = onClickListener;
        c6545.f22062 = i;
        c6545.f22078 = true;
        return this;
    }

    public C18540 setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        C6545 c6545 = this.P;
        c6545.f22050 = listAdapter;
        c6545.f22071 = onClickListener;
        c6545.f22062 = i;
        c6545.f22078 = true;
        return this;
    }

    public C18540 setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.P.f22072 = onItemSelectedListener;
        return this;
    }

    public C18540 setView(int i) {
        C6545 c6545 = this.P;
        c6545.f22059 = null;
        c6545.f22048 = i;
        c6545.f22047 = false;
        return this;
    }

    public C18540 setView(View view) {
        C6545 c6545 = this.P;
        c6545.f22059 = view;
        c6545.f22048 = 0;
        c6545.f22047 = false;
        return this;
    }

    @Deprecated
    public C18540 setView(View view, int i, int i2, int i3, int i4) {
        C6545 c6545 = this.P;
        c6545.f22059 = view;
        c6545.f22048 = 0;
        c6545.f22047 = true;
        c6545.f22067 = i;
        c6545.f22053 = i2;
        c6545.f22063 = i3;
        c6545.f22051 = i4;
        return this;
    }

    @Deprecated
    public C18540 setInverseBackgroundForced(boolean z) {
        this.P.getClass();
        return this;
    }

    public C18540 setRecycleOnMeasureEnabled(boolean z) {
        this.P.getClass();
        return this;
    }

    public DialogInterfaceC7957 create() {
        int i;
        ListAdapter simpleCursorAdapter;
        DialogInterfaceC7957 dialogInterfaceC7957 = new DialogInterfaceC7957(this.P.f22052, this.mTheme);
        C6545 c6545 = this.P;
        View view = c6545.f22044;
        ContextThemeWrapper contextThemeWrapper = c6545.f22052;
        C17834 c17834 = dialogInterfaceC7957.f26144;
        if (view != null) {
            c17834.m41415(view);
        } else {
            CharSequence charSequence = c6545.f22045;
            if (charSequence != null) {
                c17834.m41420(charSequence);
            }
            Drawable drawable = c6545.f22065;
            if (drawable != null) {
                c17834.m41414(drawable);
            }
            int i2 = c6545.f22049;
            if (i2 != 0) {
                c17834.m41412(i2);
            }
        }
        CharSequence charSequence2 = c6545.f22057;
        if (charSequence2 != null) {
            c17834.m41417(charSequence2);
        }
        CharSequence charSequence3 = c6545.f22068;
        if (charSequence3 != null || c6545.f22061 != null) {
            c17834.m41413(-1, charSequence3, c6545.f22081, c6545.f22061);
        }
        CharSequence charSequence4 = c6545.f22060;
        if (charSequence4 != null || c6545.f22075 != null) {
            c17834.m41413(-2, charSequence4, c6545.f22058, c6545.f22075);
        }
        CharSequence charSequence5 = c6545.f22070;
        if (charSequence5 != null || c6545.f22056 != null) {
            c17834.m41413(-3, charSequence5, c6545.f22077, c6545.f22056);
        }
        if (c6545.f22073 != null || c6545.f22079 != null || c6545.f22050 != null) {
            C21362 c21362 = (C21362) c6545.f22055.inflate(c17834.f56491, (ViewGroup) null);
            if (c6545.f22069) {
                if (c6545.f22079 == null) {
                    simpleCursorAdapter = new C22068(c6545, contextThemeWrapper, c17834.f56510, c6545.f22073, c21362);
                } else {
                    simpleCursorAdapter = new C0900(c6545, contextThemeWrapper, c6545.f22079, c21362, c17834);
                }
            } else {
                if (c6545.f22078) {
                    i = c17834.f56486;
                } else {
                    i = c17834.f56499;
                }
                int i3 = i;
                if (c6545.f22079 != null) {
                    simpleCursorAdapter = new SimpleCursorAdapter(contextThemeWrapper, i3, c6545.f22079, new String[]{c6545.f22074}, new int[]{R.id.text1});
                } else {
                    ListAdapter c15013 = c6545.f22050;
                    if (c15013 == null) {
                        c15013 = new C15013(contextThemeWrapper, i3, R.id.text1, c6545.f22073);
                    }
                    simpleCursorAdapter = c15013;
                }
            }
            c17834.f56477 = simpleCursorAdapter;
            c17834.f56503 = c6545.f22062;
            if (c6545.f22071 != null) {
                c21362.setOnItemClickListener(new C12896(c6545, c17834));
            } else if (c6545.f22043 != null) {
                c21362.setOnItemClickListener(new C3722(c6545, c21362, c17834));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = c6545.f22072;
            if (onItemSelectedListener != null) {
                c21362.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (c6545.f22078) {
                c21362.setChoiceMode(1);
            } else if (c6545.f22069) {
                c21362.setChoiceMode(2);
            }
            c17834.f56500 = c21362;
        }
        View view2 = c6545.f22059;
        if (view2 != null) {
            if (c6545.f22047) {
                c17834.m41416(view2, c6545.f22067, c6545.f22053, c6545.f22063, c6545.f22051);
            } else {
                c17834.m41419(view2);
            }
        } else {
            int i4 = c6545.f22048;
            if (i4 != 0) {
                c17834.m41418(i4);
            }
        }
        dialogInterfaceC7957.setCancelable(this.P.f22066);
        if (this.P.f22066) {
            dialogInterfaceC7957.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC7957.setOnCancelListener(this.P.f22076);
        dialogInterfaceC7957.setOnDismissListener(this.P.f22064);
        DialogInterface.OnKeyListener onKeyListener = this.P.f22054;
        if (onKeyListener != null) {
            dialogInterfaceC7957.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC7957;
    }

    public DialogInterfaceC7957 show() {
        DialogInterfaceC7957 dialogInterfaceC7957Create = create();
        dialogInterfaceC7957Create.show();
        return dialogInterfaceC7957Create;
    }
}
