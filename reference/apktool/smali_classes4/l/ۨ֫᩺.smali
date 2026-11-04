.class public final synthetic Ll/ۨ֫᩺;
.super Ljava/lang/Object;
.source "R7DK"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ܰ:Ll/ۘ֫᩺;


# direct methods
.method public synthetic constructor <init>(Ll/ۘ֫᩺;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ֫᩺;->ܰ:Ll/ۘ֫᩺;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 9

    .line 121
    iget-object v0, p0, Ll/ۨ֫᩺;->ܰ:Ll/ۘ֫᩺;

    iget v1, v0, Ll/ۘ֫᩺;->۫᩷:I

    .line 122
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v0, Ll/֫ۧ᩺;->֨ۙ:Ll/֫ۧ᩺;

    check-cast v2, Ll/֡ۚ᩺;

    iget-object v2, v2, Ll/֫ۧ᩺;->ۤ᩷:Ll/֫֫᩺;

    iget v3, v0, Ll/ۘ֫᩺;->۫᩷:I

    new-instance v4, Ll/ۛ֫᩺;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Ll/ۛ֫᩺;-><init>(I)V

    invoke-virtual {v2, v3, v4}, Ll/֫֫᩺;->᩷(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v2

    iget v3, v0, Ll/ۘ֫᩺;->ۚ᩷:I

    .line 123
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, v0, Ll/֫ۧ᩺;->֨ۙ:Ll/֫ۧ᩺;

    check-cast v4, Ll/֡ۚ᩺;

    iget-object v4, v4, Ll/֫ۧ᩺;->ۤ᩷:Ll/֫֫᩺;

    iget v6, v0, Ll/ۘ֫᩺;->ۚ᩷:I

    new-instance v7, Ll/ܳܶۤ;

    const/4 v8, 0x7

    invoke-direct {v7, v8}, Ll/ܳܶۤ;-><init>(I)V

    invoke-virtual {v4, v6, v7}, Ll/֫֫᩺;->᩷(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v4

    .line 124
    iget-object v0, v0, Ll/֫ۧ᩺;->᩸᩷:Ll/᩵᩻᩺;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    const/4 v6, 0x5

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v1, v6, v5

    const/4 v1, 0x1

    aput-object v2, v6, v1

    const/4 v1, 0x2

    aput-object v3, v6, v1

    const/4 v1, 0x3

    aput-object v4, v6, v1

    const/4 v1, 0x4

    aput-object v0, v6, v1

    const-string v0, "FieldData: name[%d]=%s type[%d]=%s%s"

    .line 19
    invoke-static {v0, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
