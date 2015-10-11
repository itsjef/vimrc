"""""""""""""""""""""""""""
" => Load pathogen paths  "
"""""""""""""""""""""""""""
execute pathogen#infect('~/.nvim_runtime/bundle/{}')

""""""""""""""""""""""""""""""
" => MRU
""""""""""""""""""""""""""""""
let MRU_Max_Entries = 100
map <leader>f :MRU<cr>

""""""""""""""""""""""""""""""
" => YankRing
""""""""""""""""""""""""""""""
if has("win32") || has("win64")
    " Do nothing
else
    try
        let g:yankring_history_dir = '~/.nvim_runtime/temp_dir/'
    catch
    endtry
endif

""""""""""""""""""""""""""""""
" => NERDTree
""""""""""""""""""""""""""""""
map <leader>nn :NERDTreeToggle<cr>
map <leader>nb :NERDTreeFromBookmark
map <leader>nf :NERDTreeFind<cr>
let g:NERDTreeWinSize=20
let g:NERDTreeWinPos="right"

function! NERDTreeQuit()
  redir => buffersoutput
  silent buffers
  redir END
"                     1BufNo  2Mods.     3File           4LineNo
  let pattern = '^\s*\(\d\+\)\(.....\) "\(.*\)"\s\+line \(\d\+\)$'
  let windowfound = 0

  for bline in split(buffersoutput, "\n")
    let m = matchlist(bline, pattern)

    if (len(m) > 0)
      if (m[2] =~ '..a..')
        let windowfound = 1
      endif
    endif
  endfor

  if (!windowfound)
    quitall
  endif
endfunction
autocmd WinEnter * call NERDTreeQuit()

""""""""""""""""""""""""""""""
" => Airline
""""""""""""""""""""""""""""""
" Avoid accidentally overwritting existing symbols
if !exists('g:airline_symbols')
    let g:airline_symbols = {}
endif

let g:airline_powerline_fonts=1
"let g:airline_theme="solarized"

"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
" => Vimroom - Goyo
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
let g:goyo_width=100
let g:goyo_margin_top = 2
let g:goyo_margin_bottom = 2
nnoremap <silent> <leader>z :Goyo<cr>

""""""""""""""""""""""""""""
" => CtrlP
""""""""""""""""""""""""""""
let g:ctrlp_map = '<c-f>' " Avoid conflict with YankRing <c-p>
let g:ctrlp_cmd = 'CtrlP'
let g:ctrlp_custom_ignore = 'node_modules\|bower_components\|^\.DS_Store\|^\.git\|^\.coffee'
