package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1599 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15717 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f51011 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f51012 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37439(final C13026 c13026) {
        Context context = c13026.getContext();
        View viewInflate = View.inflate(context, R.layout.MT_Protector, null);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewInflate.findViewById(R.id.editText2);
        final TextView textView = (TextView) viewInflate.findViewById(R.id.textView);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.id.checkBox2);
        checkBox.setChecked(f51012);
        checkBox2.setChecked(f51011);
        C13732 c13732 = c13026.f43452;
        int iM33443 = c13732.m33443();
        m37434(editText, iM33443);
        int i = 1;
        if (c13732.m33475()) {
            int iM33465 = c13732.m33465();
            if (f51012) {
                m37434(editText2, (iM33465 - iM33443) + 1);
            } else {
                textView.setText(R.string.MT_Protector);
                m37434(editText2, iM33465);
            }
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩵ۙ᩹
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C15717.m37438(textView, editText, editText2, c13026, z);
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۡۙ᩹
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C15717.m37437(editText, editText2, c13026, z);
            }
        });
        editText.addTextChangedListener(new C20655(editText, editText2, c13026));
        m37441(editText, editText2, c13732.m33442());
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(context);
        c8067.m21258(viewInflate);
        c8067.m21251(R.string.MT_Protector, null);
        final DialogInterfaceC19356 dialogInterfaceC19356M52499 = C23821.m52499(c8067, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC19356M52499.m44361().setOnClickListener(new ViewOnClickListenerC19974(c13026, editText, editText2, i));
        dialogInterfaceC19356M52499.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۤۙ᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15717.m37436(editText, editText2, c13026, dialogInterfaceC19356M52499);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37438(TextView textView, EditText editText, EditText editText2, C13026 c13026, boolean z) {
        f51012 = z;
        int i = 16;
        try {
            if (z) {
                textView.setText(R.string.MT_Protector);
                int i2 = Integer.parseInt(editText.getText().toString(), f51011 ? 16 : 10);
                String string = editText2.getText().toString();
                if (!f51011) {
                    i = 10;
                }
                int i3 = Integer.parseInt(string, i);
                if (i3 < i2) {
                    m37434(editText, i3);
                    m37434(editText2, (i2 - i3) + 1);
                } else {
                    m37434(editText2, (i3 - i2) + 1);
                }
            } else {
                textView.setText(R.string.MT_Protector);
                int i4 = Integer.parseInt(editText.getText().toString(), f51011 ? 16 : 10);
                String string2 = editText2.getText().toString();
                if (!f51011) {
                    i = 10;
                }
                long j = (((long) i4) + ((long) Integer.parseInt(string2, i))) - 1;
                if (j < -2147483648L || j > 2147483647L) {
                    throw new NumberFormatException();
                }
                m37434(editText2, (int) j);
            }
        } catch (NumberFormatException unused) {
        }
        m37441(editText, editText2, c13026.f43452.m33442());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37437(EditText editText, EditText editText2, C13026 c13026, boolean z) {
        f51011 = z;
        try {
            m37434(editText, Integer.parseInt(editText.getText().toString(), f51011 ? 10 : 16));
        } catch (NumberFormatException unused) {
        }
        try {
            m37434(editText2, Integer.parseInt(editText2.getText().toString(), f51011 ? 10 : 16));
        } catch (NumberFormatException unused2) {
        }
        m37441(editText, editText2, c13026.f43452.m33442());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37440(C13026 c13026, EditText editText, EditText editText2, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        C13732 c13732 = c13026.f43452;
        int iM33442 = c13732.m33442();
        if (itemId == 17039373) {
            if (f51012) {
                m37434(editText, 0);
                m37434(editText2, iM33442);
                return;
            } else {
                m37434(editText, 0);
                m37434(editText2, Math.max(iM33442 - 1, 0));
                return;
            }
        }
        if (itemId == R.string.MT_Protector) {
            if (f51012) {
                m37434(editText, 0);
                m37434(editText2, iM33442 != 0 ? c13732.m33465() + 1 : 0);
                return;
            } else {
                m37434(editText, 0);
                return;
            }
        }
        if (itemId == R.string.MT_Protector) {
            if (f51012) {
                m37434(editText2, iM33442 - c13732.m33443());
            } else {
                m37434(editText2, Math.max(iM33442 - 1, 0));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37436(EditText editText, EditText editText2, C13026 c13026, DialogInterfaceC19356 dialogInterfaceC19356) {
        int i;
        C13732 c13732 = c13026.f43452;
        try {
            int i2 = Integer.parseInt(editText.getText().toString(), f51011 ? 16 : 10);
            try {
                int i3 = Integer.parseInt(editText2.getText().toString(), f51011 ? 16 : 10);
                int iM33442 = c13732.m33442();
                if (f51012) {
                    try {
                        if (iM33442 < 0 || i2 < 0 || i2 > iM33442 || i3 < 0) {
                            throw new IllegalArgumentException("Selection range is out of bounds");
                        }
                        if (i3 == 0) {
                            i = i2;
                        } else {
                            long j = (((long) i2) + ((long) i3)) - 1;
                            if (i2 == iM33442 || j >= iM33442) {
                                throw new IllegalArgumentException("Selection range is out of bounds");
                            }
                            i = (int) j;
                        }
                        if (i3 == 0) {
                            c13732.m33449(i2, true);
                            c13026.invalidate();
                            c13026.m32232(c13732.m33443());
                            dialogInterfaceC19356.dismiss();
                            return;
                        }
                        i3 = i;
                    } catch (IllegalArgumentException unused) {
                        C15829.m37617(R.string.MT_Protector, 0).m37622();
                        return;
                    }
                } else {
                    if (iM33442 == 0 && i2 == 0 && i3 == 0) {
                        c13732.m33449(0, true);
                        c13026.invalidate();
                        c13026.m32232(c13732.m33443());
                        dialogInterfaceC19356.dismiss();
                        return;
                    }
                    if (i2 > i3) {
                        i3 = i2;
                        i2 = i3;
                    }
                }
                if (i2 < 0 || i3 >= iM33442) {
                    C15829.m37617(R.string.MT_Protector, 0).m37622();
                } else {
                    c13026.m32225(i2, i3);
                    dialogInterfaceC19356.dismiss();
                }
            } catch (NumberFormatException unused2) {
                editText2.requestFocus();
                C15829.m37617(R.string.MT_Protector, 0).m37622();
            }
        } catch (NumberFormatException unused3) {
            editText.requestFocus();
            C15829.m37617(R.string.MT_Protector, 0).m37622();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m37441(EditText editText, EditText editText2, int i) {
        try {
            int i2 = Integer.parseInt(editText.getText().toString(), f51011 ? 16 : 10);
            if (i2 >= i) {
                throw new NumberFormatException();
            }
            if (f51012) {
                int i3 = i - i2;
                if (f51011) {
                    editText2.setHint("1…" + Integer.toHexString(i3).toUpperCase());
                    return;
                } else {
                    editText2.setHint("1…" + i3);
                    return;
                }
            }
            int i4 = i - 1;
            if (f51011) {
                editText2.setHint(Integer.toHexString(i2).toUpperCase() + "…" + Integer.toHexString(i4).toUpperCase());
                return;
            }
            editText2.setHint(i2 + "…" + i4);
        } catch (NumberFormatException unused) {
            editText2.setHint((CharSequence) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37434(EditText editText, int i) {
        editText.setText(Integer.toString(i, f51011 ? 16 : 10).toUpperCase());
        editText.setSelection(editText.length());
    }
}
