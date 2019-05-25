package com.smlnskgmail.jaman.hashchecker.components.filemanager.explorer.dataadapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.smlnskgmail.jaman.hashchecker.R;
import com.smlnskgmail.jaman.hashchecker.components.filemanager.data.FileItem;
import com.smlnskgmail.jaman.hashchecker.components.filemanager.explorer.OnFileClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

class FileDialogHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_item_file)
    protected TextView itemFile;

    private OnFileClickListener fileClickListener;

    FileDialogHolder(@NonNull View itemView, @NonNull OnFileClickListener fileClickListener) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        this.fileClickListener = fileClickListener;
    }

    void bind(@NonNull FileItem file) {
        loadItem(file);
        itemView.setOnClickListener(v -> fileClickListener.onFileClick(file, getAdapterPosition()));
    }

    private void loadItem(@NonNull FileItem file) {
        itemFile.setText(file.getFileName());
        Drawable fileIcon = ContextCompat.getDrawable(itemView.getContext(), file.getFileType()
                .getIconResId());
        itemFile.setCompoundDrawablesRelativeWithIntrinsicBounds(fileIcon, null, null, null);
    }

}
