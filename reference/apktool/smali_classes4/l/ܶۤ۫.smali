.class public final synthetic Ll/ܶۤ۫;
.super Ljava/lang/Object;
.source "J4L7"

# interfaces
.implements Landroid/text/InputFilter;


# instance fields
.field public final synthetic ܰ:Ll/ۢۤ۫;


# direct methods
.method public synthetic constructor <init>(Ll/ۢۤ۫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۤ۫;->ܰ:Ll/ۢۤ۫;

    return-void
.end method


# virtual methods
.method public final filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 0

    .line 0
    iget-object p4, p0, Ll/ܶۤ۫;->ܰ:Ll/ۢۤ۫;

    invoke-static {p4, p1, p2, p3}, Ll/ۢۤ۫;->ۙ(Ll/ۢۤ۫;Ljava/lang/CharSequence;II)Landroid/text/SpannableString;

    move-result-object p1

    return-object p1
.end method
