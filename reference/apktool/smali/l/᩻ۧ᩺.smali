.class public final synthetic Ll/᩻ۧ᩺;
.super Ljava/lang/Object;
.source "I7DX"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ܰ:Ll/ۗۧ᩺;


# direct methods
.method public synthetic constructor <init>(Ll/ۗۧ᩺;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۧ᩺;->ܰ:Ll/ۗۧ᩺;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 9

    .line 127
    iget-object v0, p0, Ll/᩻ۧ᩺;->ܰ:Ll/ۗۧ᩺;

    iget v1, v0, Ll/֫ۧ᩺;->֡ۙ:I

    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 129
    iget v2, v0, Ll/֫ۧ᩺;->֡ۙ:I

    sget-object v3, Ll/ᩴ۬ۛ;->ۡ:Ll/ᩴ۬ۛ;

    invoke-static {v2, v3}, Ll/ܺ۬ۛ;->᩷(ILl/ᩴ۬ۛ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "<none>"

    goto :goto_0

    .line 130
    :cond_0
    iget v2, v0, Ll/֫ۧ᩺;->֡ۙ:I

    invoke-static {v2, v3}, Ll/ܺ۬ۛ;->᩷(ILl/ᩴ۬ۛ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    :goto_0
    iget v3, v0, Ll/ۗۧ᩺;->ܽ᩷:I

    .line 131
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, v0, Ll/֫ۧ᩺;->֨ۙ:Ll/֫ۧ᩺;

    check-cast v4, Ll/֡ۚ᩺;

    iget-object v4, v4, Ll/֫ۧ᩺;->ۤ᩷:Ll/֫֫᩺;

    iget v5, v0, Ll/ۗۧ᩺;->ܽ᩷:I

    new-instance v6, Ll/ܿۘۗ;

    const/16 v7, 0x9

    invoke-direct {v6, v7}, Ll/ܿۘۗ;-><init>(I)V

    invoke-virtual {v4, v5, v6}, Ll/֫֫᩺;->᩷(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v4

    iget v5, v0, Ll/ۗۧ᩺;->֫᩷:I

    .line 132
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, v0, Ll/֫ۧ᩺;->֨ۙ:Ll/֫ۧ᩺;

    check-cast v6, Ll/֡ۚ᩺;

    iget-object v6, v6, Ll/֫ۧ᩺;->ۤ᩷:Ll/֫֫᩺;

    iget v0, v0, Ll/ۗۧ᩺;->֫᩷:I

    new-instance v8, Ll/ܿۘۗ;

    invoke-direct {v8, v7}, Ll/ܿۘۗ;-><init>(I)V

    invoke-virtual {v6, v0, v8}, Ll/֫֫᩺;->᩷(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x6

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v1, 0x1

    aput-object v2, v6, v1

    const/4 v1, 0x2

    aput-object v3, v6, v1

    const/4 v1, 0x3

    aput-object v4, v6, v1

    const/4 v1, 0x4

    aput-object v5, v6, v1

    const/4 v1, 0x5

    aput-object v0, v6, v1

    const-string v0, "MethodData: {modifiers[%d]}:%s name[%d]=%s signature[%d]=%s"

    .line 19
    invoke-static {v0, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
